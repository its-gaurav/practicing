package lld.parkinglot;

import lld.parkinglot.service.PaymentService;
import lld.parkinglot.service.PaymentServiceFactory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExitGate {

    private PaymentServiceFactory paymentServiceFactory;

    public ExitGate(PaymentServiceFactory paymentServiceFactory) {
        this.paymentServiceFactory = paymentServiceFactory;
    }

    public double calculateFare(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now().plusHours(3); // added hours to test functionality
        long hours = ChronoUnit.HOURS.between(ticket.getEntryTime(), currentTime);
        double pricePerHour = ticket.getParkingSpot().getPricePerHour();
        double totalFare = pricePerHour*hours;
        System.out.println("Fare is "+totalFare+", ticket is "+ticket);
        return totalFare;
    }
    public void processPayment(double fareCalculated, String paymentType) {
        PaymentService paymentService = paymentServiceFactory.getPaymentService(paymentType);
        paymentService.processPayment(fareCalculated);
    }

    public void freeParkingSpot(ParkingSpot parkingSpot) {
        System.out.println("Vehicle "+ parkingSpot.getParkedVehicle().getRegistration() +" removed from parking spot");
        parkingSpot.setParkedVehicle(null);
        parkingSpot.setEmpty(true);
    }
}
