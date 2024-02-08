package lld.parkinglot;

import java.util.List;

public interface ParkingSpotManager {

    void addParkingSpot(ParkingSpot parkingSpot);
    void removeParkingSpot(ParkingSpot parkingSpot);

    List<ParkingSpot> getParkingSpots();

    ParkingSpot findAvailableParkingSpot();
}
