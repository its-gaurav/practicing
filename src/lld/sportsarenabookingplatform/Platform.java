package lld.sportsarenabookingplatform;

import java.time.LocalDateTime;
import java.util.List;

public interface Platform {

    void addArena(Vendor vendor, Arena arena);

    void addVendor(Vendor vendor);

    void removeArena(Vendor vendor, Arena arena);

    List<Arena> searchArena(String arenaType, LocalDateTime bookingStartTime, LocalDateTime bookingEndTime);

    BookingDetail bookArena(Customer customer, Arena arena, LocalDateTime bookingStartTime, LocalDateTime bookingEndTime);

    void cancelBooking(BookingDetail bookingDetails);

    void processPayment(double amount, String paymentMode);

}
