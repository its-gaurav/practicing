package lld.elevatorsystem;

import java.util.List;

public class Floor {
    private int id;
    private List<ElevatorCaller> elevatorCallers;

    public Floor(int id, List<ElevatorCaller> elevatorCallers) {
        this.id = id;
        this.elevatorCallers = elevatorCallers;
    }

    public void callElevator(ElevatorCaller elevatorCaller, Direction direction, int floor) {
        elevatorCaller.callElevator(direction, floor);
    }

    public void move(ElevatorCaller elevatorCaller) {
        elevatorCaller.move();
    }
}
