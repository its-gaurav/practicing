package lld.elevatorsystem;

import java.util.Arrays;

public class BuildingUtil {

    public static void main(String[] args) {
        ElevatorCar elevatorCar = new ElevatorCar(State.IDLE, new Display(0, null), new ElevatorControlPanelImpl());

        ElevatorCaller elevatorCaller = new ElevatorCaller(elevatorCar);

        Floor firstFloor = new Floor(1, Arrays.asList(elevatorCaller));
        Floor secondFloor = new Floor(2, Arrays.asList(elevatorCaller));


        Building building = new Building("TSD", Arrays.asList(firstFloor, secondFloor));

        firstFloor.callElevator(elevatorCaller, Direction.UP, 5);
        firstFloor.callElevator(elevatorCaller, Direction.UP, 15);
        firstFloor.callElevator(elevatorCaller, Direction.UP, 12);
        firstFloor.callElevator(elevatorCaller, Direction.DOWN, 7);
        firstFloor.callElevator(elevatorCaller, Direction.UP, 8);
        firstFloor.callElevator(elevatorCaller, Direction.UP, 9);
        firstFloor.callElevator(elevatorCaller, Direction.UP, 11);
        firstFloor.callElevator(elevatorCaller, Direction.DOWN, 4);
        firstFloor.callElevator(elevatorCaller, Direction.UP, 7);

        firstFloor.move(elevatorCaller);
    }



}
