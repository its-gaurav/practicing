package lld.elevatorsystem;

public abstract class ElevatorControlPanel {
    abstract void submitRequest(Request request, ElevatorCar elevatorCar); // to which floor you have to go

    void alarm() {
        System.out.println("Alarming");
    }

    abstract void move(ElevatorCar elevatorCar);
}
