package lld.parkinglot;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExitGate {

    public double calculateFare(Ticket ticket) {
        LocalDateTime currentTime = LocalDateTime.now().plusHours(3); // added hours to test functionality
        long hours = ChronoUnit.HOURS.between(ticket.getEntryTime(), currentTime);
        double pricePerHour = ticket.getParkingSpot().getPricePerHour();
        double totalFare = pricePerHour*hours;
        System.out.println("Fare is "+totalFare+", ticket is "+ticket);
        return totalFare;
    }

    public void processPayment() {

    }

    public void freeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.setParkedVehicle(null);
        parkingSpot.setEmpty(true);
    }
}
