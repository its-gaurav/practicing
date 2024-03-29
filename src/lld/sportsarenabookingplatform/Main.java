package lld.sportsarenabookingplatform;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaymentServiceFactory paymentServiceFactory = new PaymentServiceFactory(new CardPaymentService(), new UPIPaymentService());
        Platform platformManager = new PlatformManager(paymentServiceFactory);
        Vendor sportsAndYou = new Vendor("sportsAndYou", "Sports And You", new FullRefundOnCancellation());
        platformManager.addVendor(sportsAndYou);
        platformManager.addArena(sportsAndYou, new Badminton("bad1", sportsAndYou, 150d));
        platformManager.addArena(sportsAndYou, new Badminton("bad2", sportsAndYou, 150d));
        platformManager.addArena(sportsAndYou, new Cricket("cri1", sportsAndYou, 550d));
        platformManager.addArena(sportsAndYou, new SwimmingPool("swi1", sportsAndYou, 180d));
        platformManager.addArena(sportsAndYou, new SwimmingPool("swi2", sportsAndYou, 180d));

        Vendor stayFit = new Vendor("stayFit", "Stay Fit", new PartialRefundOnCancellation());
        platformManager.addVendor(stayFit);
        platformManager.addArena(stayFit, new Badminton("bad21", stayFit, 130d));
        platformManager.addArena(stayFit, new Badminton("bad22", stayFit, 130d));
        platformManager.addArena(stayFit, new Cricket("cri21", stayFit, 450d));
        platformManager.addArena(stayFit, new SwimmingPool("swi21", stayFit, 170d));
        platformManager.addArena(stayFit, new SwimmingPool("swi22", stayFit, 170d));

        Customer customer = new Customer("user1", "Gaurav Raj");
        LocalDateTime startTime = LocalDateTime.now().minusHours(1);
        LocalDateTime endTime = LocalDateTime.now();
        List<Arena> arenasAvailable = platformManager.searchArena(Constants.BADMINTON, startTime, endTime);
        System.out.println("Arenas Available: "+arenasAvailable);
        BookingDetail bookingDetail = platformManager.bookArena(customer, arenasAvailable.stream().findAny().get(), startTime, endTime);
        platformManager.processPayment(bookingDetail.getTotalFare(), Constants.CARD);
        System.out.println(bookingDetail);
        System.out.println("Arenas Available: "+platformManager.searchArena(Constants.BADMINTON, startTime, endTime));

        platformManager.cancelBooking(bookingDetail);
        System.out.println("Arenas Available: "+platformManager.searchArena(Constants.BADMINTON, startTime, endTime));


    }
}
