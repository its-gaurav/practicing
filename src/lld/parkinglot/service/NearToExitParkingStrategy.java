package lld.parkinglot.service;

import lld.parkinglot.Vehicle;

public class NearToExitParkingStrategy implements ParkingStrategy {
    @Override
    public void parkVehicle(Vehicle vehicle) {
        System.out.println(vehicle.getName() + " : parked near to exit gate");
    }
}
