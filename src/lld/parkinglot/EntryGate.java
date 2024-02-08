package lld.parkinglot;

import java.time.LocalDateTime;

public class EntryGate {

    ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntryGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getType());
        ParkingSpot availableSpot = parkingSpotManager.findAvailableParkingSpot();
        return availableSpot;
    }

    public Ticket issueTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingSpot.setEmpty(false);
        parkingSpot.setParkedVehicle(vehicle);
        Ticket ticket = new Ticket(LocalDateTime.now(), parkingSpot);
        return ticket;
    }
}
