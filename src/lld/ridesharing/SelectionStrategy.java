package lld.ridesharing;

import java.util.List;

public abstract class SelectionStrategy {

    private List<RideDetails> offeredRides;

    public SelectionStrategy(List<RideDetails> offeredRides) {
        this.offeredRides = offeredRides;
    }

    abstract RideDetails selectRide(RideDetails requestedRide);

    public List<RideDetails> findEligibleOfferedRideDetails(RideDetails requestedRide) {
        return offeredRides.stream()
                .filter(offeredRide -> offeredRide.getOrigin().equalsIgnoreCase(requestedRide.getOrigin()) &&
                        offeredRide.getDestination().equalsIgnoreCase(requestedRide.getDestination()) &&
                        offeredRide.getAvailableSeats() >= requestedRide.getAvailableSeats() &&
                        !offeredRide.isCompleted()).toList();
    }
}
