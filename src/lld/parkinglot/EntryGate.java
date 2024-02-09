package lld.parkinglot;

import lld.parkinglot.service.ParkingSpotManager;
import lld.parkinglot.service.ParkingSpotManagerFactory;

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

    public Ticket parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getType());
        parkingSpotManager.parkVehicle(parkingSpot, vehicle);
        return issueTicket(parkingSpot);
    }

    private static Ticket issueTicket(ParkingSpot parkingSpot) {
        return new Ticket(LocalDateTime.now(), parkingSpot);
    }
}
