package lld.parkinglot.service;

import lld.parkinglot.ParkingSpot;
import lld.parkinglot.Vehicle;

import java.util.List;

public class FourWheelerSpotManager implements ParkingSpotManager {
    private List<ParkingSpot> parkingSpots;
    private ParkingStrategy parkingStrategy;

    public FourWheelerSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot);
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    @Override
    public ParkingSpot findAvailableParkingSpot() {
        return parkingSpots
                .stream()
                .filter(spot -> spot.isEmpty())
                .findAny()
                .orElseThrow(() -> new RuntimeException("Spot Not Available"));
    }

    @Override
    public void parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle) {
        parkingStrategy.parkVehicle(vehicle);
        parkingSpot.setEmpty(false);
        parkingSpot.setParkedVehicle(vehicle);
    }
}
