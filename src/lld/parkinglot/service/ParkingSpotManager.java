package lld.parkinglot.service;

import lld.parkinglot.ParkingSpot;
import lld.parkinglot.Vehicle;

import java.util.List;

public interface ParkingSpotManager {

    void addParkingSpot(ParkingSpot parkingSpot);
    void removeParkingSpot(ParkingSpot parkingSpot);

    List<ParkingSpot> getParkingSpots();

    ParkingSpot findAvailableParkingSpot();

    void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle);
}
