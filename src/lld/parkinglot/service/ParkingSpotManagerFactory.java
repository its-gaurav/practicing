package lld.parkinglot.service;

import lld.parkinglot.VehicleType;

public class ParkingSpotManagerFactory {

    private ParkingSpotManager twoWheelerSpotManager;
    private ParkingSpotManager fourWheelerSpotManager;

    public ParkingSpotManagerFactory(ParkingSpotManager twoWheelerSpotManager, ParkingSpotManager fourWheelerSpotManager) {
        this.twoWheelerSpotManager = twoWheelerSpotManager;
        this.fourWheelerSpotManager = fourWheelerSpotManager;
    }

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        if (VehicleType.FOUR_WHLR.equals(vehicleType)) {
            return fourWheelerSpotManager;
        }
        return twoWheelerSpotManager;
    }
}
