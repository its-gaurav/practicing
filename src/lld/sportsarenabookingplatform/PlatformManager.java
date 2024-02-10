package lld.sportsarenabookingplatform;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PlatformManager implements Platform {

    private List<Vendor> vendors;
    private List<BookingDetail> bookingDetails;

    private PaymentServiceFactory paymentServiceFactory;

    public PlatformManager(PaymentServiceFactory paymentServiceFactory) {
        this.paymentServiceFactory = paymentServiceFactory;
        this.vendors = new ArrayList<>();
        this.bookingDetails = new ArrayList<>();
    }

    @Override
    public void addVendor(Vendor vendor) {
        vendors.add(vendor);
    }

    @Override
    public void addArena(Vendor vendor, Arena arena) {
        System.out.println("Adding Arena to Vendor");
        vendor.getArenas().add(arena);
    }

    @Override
    public void removeArena(Vendor vendor, Arena arena) {
        System.out.println("Removing Arena from Vendor");
        vendor.getArenas().remove(arena);
    }

    /**
     *  list of arenas which are of given arenaType
     *  once we find the list, find all active bookings of each arena
     *  if no active booking, arena is available
     *  Else if active booking on an arena --> check each booking,
     *          if requestedBookingStartTime is after already-booked-end-time OR requestedBookingEndTime is before already-booked-start-time
     *          if above condition is true for all bookings of an arena, then arena can be booked for given timeframe
     * */
    @Override
    public List<Arena> searchArena(String arenaType, LocalDateTime requestedBookingStartTime, LocalDateTime requestedBookingEndTime) {
        List<Arena> arenas = new ArrayList<>();
        vendors.forEach(vendor -> arenas.addAll(vendor.getArenas()));
        List<Arena> arenasOfGivenArenaType = findArenasOfGivenArenaType(arenaType, arenas);
        // filter active booking-details of above arenas
        List<BookingDetail> activeBookingDetails = new ArrayList<>();
        // arena wise all active booking details
        Map<Arena, List<BookingDetail>> arenaWiseBookingDetails = new HashMap<>();
//        bookingDetails.forEach(bookingDetail -> {
//            if (bookingDetail.isActive() && arenasOfGivenArenaType.contains(bookingDetail.getArena())) {
//                activeBookingDetails.add(bookingDetail);
//                if (!arenaWiseBookingDetails.containsKey(bookingDetail.getArena())) {
//                    arenaWiseBookingDetails.put(bookingDetail.getArena(), new ArrayList<>());
//                }
//                arenaWiseBookingDetails.get(bookingDetail.getArena()).add(bookingDetail);
//            }
//        });
        arenasOfGivenArenaType.forEach(arena -> {
            List<BookingDetail> arenaBookingDetails = bookingDetails
                    .stream()
                    .filter(booking -> booking.isActive() && booking.getArena().equals(arena))
                    .toList();
            arenaWiseBookingDetails.put(arena, arenaBookingDetails);
        });
        List<Arena> searchedArenas = new ArrayList<>();
        // finding arenas not booked during given time
        for (Map.Entry<Arena, List<BookingDetail>> arenaBookingDetails: arenaWiseBookingDetails.entrySet()) {
            Predicate<BookingDetail> bookingTimeCollidesWithExisting = bookingDetail ->
                    !(requestedBookingStartTime.isAfter(bookingDetail.getBookingEndTime()) ||
                    requestedBookingEndTime.isBefore(bookingDetail.getBookingStartTime()));

            if (arenaBookingDetails.getValue()
                    .stream()
                    .noneMatch(bookingTimeCollidesWithExisting)) {
                searchedArenas.add(arenaBookingDetails.getKey());
            }
        }

        return searchedArenas;
    }

    private static List<Arena> findArenasOfGivenArenaType(String arenaType, List<Arena> arenas) {
        List<Arena> arenasOfGivenArenaType = new ArrayList<>();
        switch (arenaType) {
            case Constants.BADMINTON -> arenas.forEach(arena -> {
                if (arena instanceof Badminton) {
                    arenasOfGivenArenaType.add(arena);
                }
            });
            case Constants.CRICKET -> arenas.forEach(arena -> {
                if (arena instanceof Cricket) {
                    arenasOfGivenArenaType.add(arena);
                }
            });
            case Constants.SWIMMING_POOL -> arenas.forEach(arena -> {
                if (arena instanceof SwimmingPool) {
                    arenasOfGivenArenaType.add(arena);
                }
            });
            default -> System.out.println("Not A Valid Arena Type");
        }

        return arenasOfGivenArenaType;
    }

    @Override
    public BookingDetail bookArena(Customer customer, Arena arena, LocalDateTime bookingStartTime, LocalDateTime bookingEndTime) {
        double fare = calculateFare(arena, bookingStartTime, bookingEndTime);
        System.out.println(arena + " is booked from "+bookingStartTime+" to "+bookingEndTime);
        BookingDetail bookingDetail = new BookingDetail(arena, customer, bookingStartTime, bookingEndTime, fare);
        this.bookingDetails.add(bookingDetail);
        return bookingDetail;
    }

    private double calculateFare(Arena arena, LocalDateTime bookingStartTime, LocalDateTime bookingEndTime) {
        double minutes = ChronoUnit.MINUTES.between(bookingStartTime, bookingEndTime);
        double hours = minutes / 60;
        return arena.getHourlyCharge()*hours;
    }

    @Override
    public void cancelBooking(BookingDetail bookingDetail) {
        bookingDetail.setActive(false);
    }

    @Override
    public void processPayment(double amount, String paymentMode) {
        System.out.println("Processing payment for "+amount);
        paymentServiceFactory.getPaymentService(paymentMode).processPayment(amount);
    }
}
