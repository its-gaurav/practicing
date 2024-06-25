package lld.elevatorsystem;

public class ElevatorCaller {

    private ElevatorCar elevatorCar;

    public ElevatorCaller(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public void callElevator(Direction direction, int floor) {
        elevatorCar.callElevator(direction, floor);
    }

    public void move() {
        elevatorCar.getControlPanel().move(elevatorCar);
    }
}
