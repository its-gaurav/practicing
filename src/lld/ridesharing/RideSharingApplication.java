package lld.ridesharing;

import java.util.*;

public class RideSharingApplication {

    private List<RideDetails> offeredRides;
    private List<RideDetails> requestedRides;
    private List<User> users;

    public RideSharingApplication() {
        offeredRides = new ArrayList<>();
        requestedRides = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addVehicle(User user, Vehicle vehicle) {
        user.getVehicles().add(vehicle);
    }

    public RideDetails offerRide(String origin, String destination, String registrationNumber, User user, int availableSeats) {
        Vehicle vehicleToOffer = user.getVehicles().stream().filter(vehicle -> vehicle.getRegistration().equalsIgnoreCase(registrationNumber))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Vehicle "+registrationNumber+" Not Found"));
        RideDetails rideDetails = new RideDetails(origin, destination, availableSeats, vehicleToOffer, user);
        Optional<RideDetails> activeRide = offeredRides.stream()
                .filter(offeredRide -> offeredRide.getVehicle().equals(rideDetails.getVehicle()) && !offeredRide.isCompleted())
                .findAny();

        if (activeRide.isEmpty()) {
            System.out.println("There is no active ride for vehicle :: "+rideDetails.getVehicle());
            offeredRides.add(rideDetails);
            return rideDetails;
        } else {
            System.out.println("Active ride already exists :: "+activeRide.get());
        }

        return null;
    }

    public void selectRide(String origin, String destination,  User requestedBy, int numberOfSeatsRequested, String preferredModel, SelectionStrategy selectionStrategy) {
        selectionStrategy.selectRide(new RideDetails(origin, destination, numberOfSeatsRequested, preferredModel, requestedBy));
    }

    public List<RideDetails> getOfferedRides() {
        return offeredRides;
    }

    public void setOfferedRides(List<RideDetails> offeredRides) {
        this.offeredRides = offeredRides;
    }

    public List<RideDetails> getRequestedRides() {
        return requestedRides;
    }

    public void setRequestedRides(List<RideDetails> requestedRides) {
        this.requestedRides = requestedRides;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void endRide(RideDetails rideDetails) {
        rideDetails.setCompleted(true);
    }

    public void printRideStat() {
        // total rides taken by each user
        Map<User, Integer> rideTakenNumbers = new HashMap<>();
        Map<User, Integer> rideOfferedNumbers = new HashMap<>();
        for (RideDetails rideDetails: offeredRides) {
            if (rideDetails.isCompleted()) {
                List<User> coPassengers = rideDetails.getCoPassengers();
                for (User user: coPassengers) {
                    if (! rideTakenNumbers.containsKey(user)) {
                        rideTakenNumbers.put(user, 1);
                    }else {
                        rideTakenNumbers.put(user, rideTakenNumbers.get(user) + 1);
                    }
                }
                User offeredBy = rideDetails.getOfferedBy();
                if (! rideOfferedNumbers.containsKey(offeredBy)) {
                    rideOfferedNumbers.put(offeredBy, 1);
                } else {
                    rideOfferedNumbers.put(offeredBy, rideOfferedNumbers.get(offeredBy) + 1);
                }
            }
        }

        for (Map.Entry<User, Integer> entry: rideTakenNumbers.entrySet()) {
            System.out.println(entry.getKey().getName()+" : "+entry.getValue()+" Taken");
        }

        for (Map.Entry<User, Integer> entry: rideOfferedNumbers.entrySet()) {
            System.out.println(entry.getKey().getName()+" : "+entry.getValue()+" Offered");
        }

    }
}
