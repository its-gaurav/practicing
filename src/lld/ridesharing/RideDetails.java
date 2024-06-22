package lld.ridesharing;

import java.util.ArrayList;
import java.util.List;

public class RideDetails {
    private String origin;
    private String destination;
    private int availableSeats;
    private Vehicle vehicle;
    private User offeredBy;
    private int requestedSeats;

    private String preferredVehicle;
    private boolean isCompleted = false;

    private List<User> coPassengers;

    private User requestedBy;

    public RideDetails(String origin, String destination, int availableSeats, Vehicle vehicle, User offeredBy) {
        this.origin = origin;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.vehicle = vehicle;
        this.offeredBy = offeredBy;
        this.coPassengers = new ArrayList<>();
    }

    public RideDetails(String origin, String destination, int requestedSeats, String preferredVehicle, User requestedBy) {
        this.origin = origin;
        this.destination = destination;
        this.requestedSeats = requestedSeats;
        this.preferredVehicle = preferredVehicle;
        this.requestedBy = requestedBy;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public User getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(User offeredBy) {
        this.offeredBy = offeredBy;
    }

    public List<User> getCoPassengers() {
        return coPassengers;
    }

    public void setCoPassengers(List<User> coPassengers) {
        this.coPassengers = coPassengers;
    }

    public int getRequestedSeats() {
        return requestedSeats;
    }

    public void setRequestedSeats(int requestedSeats) {
        this.requestedSeats = requestedSeats;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getPreferredVehicle() {
        return preferredVehicle;
    }

    public void setPreferredVehicle(String preferredVehicle) {
        this.preferredVehicle = preferredVehicle;
    }

    public User getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(User requestedBy) {
        this.requestedBy = requestedBy;
    }

    @Override
    public String toString() {
        return "RideDetails{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", vehicle=" + vehicle +
                ", offeredBy=" + offeredBy +
                ", coPassengers=" + coPassengers +
                '}';
    }
}
