package lld.elevatorsystem;

public class ElevatorCar {
    private State state;
    private Display display;
    private ElevatorControlPanel controlPanel;

    public ElevatorCar(State state, Display display, ElevatorControlPanel controlPanel) {
        this.state = state;
        this.display = display;
        this.controlPanel = controlPanel;
    }

    public void callElevator(Direction direction, int floor) { // request came from which floor
        controlPanel.submitRequest(new Request(floor, direction), this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public ElevatorControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setControlPanel(ElevatorControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }
}
