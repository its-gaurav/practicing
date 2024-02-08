package lld.parkinglot;

public class DefaultParkingStrategy implements ParkingStrategy {

    @Override
    public void parkVehicle(Vehicle vehicle) {
        System.out.println(vehicle.getName() + " : parked wherever space is there");
    }
}
