package lld.elevatorsystem;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorControlPanelImpl extends ElevatorControlPanel{

    private PriorityQueue<Request> upRequests = new PriorityQueue<>(new Comparator<Request>() {
        @Override
        public int compare(Request o1, Request o2) {
            return o1.getFloor() - o2.getFloor();
        }
    });

    private PriorityQueue<Request> downRequests = new PriorityQueue<>(new Comparator<Request>() {
        @Override
        public int compare(Request o1, Request o2) {
            return o2.getFloor() - o1.getFloor();
        }
    });

    private Queue<Request> pendingRequests = new LinkedList<>();

    @Override
    void submitRequest(Request request, ElevatorCar elevatorCar) {
        Direction currentDirection = elevatorCar.getDisplay().getDirection();
        int currentFloor = elevatorCar.getDisplay().getFloor();
        if (null == currentDirection) {
            currentDirection = request.getDirection();
            elevatorCar.getDisplay().setDirection(currentDirection);
            elevatorCar.setState(State.MOVING);
        }
        if (Direction.UP.equals(currentDirection)) {
            if (Direction.UP.equals(request.getDirection())) {
                if (request.getFloor() > currentFloor) {
                    upRequests.add(request);
                } else {
                    pendingRequests.add(request);
                }
            } else {
                downRequests.add(request);
            }
        } else {
            if (Direction.DOWN.equals(request.getDirection())) {
                if (request.getFloor() < currentFloor) {
                    downRequests.add(request);
                } else {
                    pendingRequests.add(request);
                }
            } else {
                upRequests.add(request);
            }
        }
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        move(elevatorCar);
    }

    public void move(ElevatorCar elevatorCar) {
        Direction currentDirection = elevatorCar.getDisplay().getDirection();
        if (upRequests.isEmpty() && downRequests.isEmpty()) {
            elevatorCar.setState(State.IDLE);
            elevatorCar.getDisplay().setDirection(null);
            return;
        }
        if (Direction.UP.equals(currentDirection)) {
            while (!upRequests.isEmpty()) {
                Request request = upRequests.poll();
                System.out.println("Elevator is at floor "+request.getFloor()+" going "+currentDirection);
            }

            while (!pendingRequests.isEmpty()) { // all pending up requests would have been here
                upRequests.add(pendingRequests.poll());
            }

            if (!downRequests.isEmpty()) {
                currentDirection = Direction.DOWN;
                while (!downRequests.isEmpty()) {
                    Request request = downRequests.poll();
                    System.out.println("Elevator is at floor "+request.getFloor()+" going "+currentDirection);
                }
            }

        } else if (Direction.DOWN.equals(currentDirection)) {
            while (!downRequests.isEmpty()) {
                Request request = downRequests.poll();
                System.out.println("Elevator is at floor "+request.getFloor()+" going "+currentDirection);
            }

            while (!pendingRequests.isEmpty()) { // all pending up requests would have been here
                downRequests.add(pendingRequests.poll());
            }

            if (!upRequests.isEmpty()) {
                currentDirection = Direction.UP;
                while (!upRequests.isEmpty()) {
                    Request request = upRequests.poll();
                    System.out.println("Elevator is at floor "+request.getFloor()+" going "+currentDirection);
                }
            }

        }
    }
}
