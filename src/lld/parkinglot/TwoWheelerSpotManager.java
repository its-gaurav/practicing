package lld.parkinglot;

import java.util.List;

public class TwoWheelerSpotManager implements ParkingSpotManager{

    private List<ParkingSpot> parkingSpots;

    public TwoWheelerSpotManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    @Override
    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot);
    }

    @Override
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
}
