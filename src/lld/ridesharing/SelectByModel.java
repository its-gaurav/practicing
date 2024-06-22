package lld.ridesharing;

import java.util.List;
import java.util.Optional;

public class SelectByModel extends SelectionStrategy{

    public SelectByModel(List<RideDetails> offeredRides) {
        super(offeredRides);
    }

    @Override
    public RideDetails selectRide(RideDetails requestedRide) {

        List<RideDetails> filteredRideDetails = findEligibleOfferedRideDetails(requestedRide);

        Optional<RideDetails> selectedRide = filteredRideDetails
                .stream()
                .filter(offeredRide -> requestedRide.getPreferredVehicle() != null &&
                        requestedRide.getPreferredVehicle().equalsIgnoreCase(offeredRide.getVehicle().getModel()))
                .findAny();
        if (selectedRide.isPresent()) {
            selectedRide.get().getCoPassengers().add(requestedRide.getRequestedBy());
            System.out.println("Ride found :"+selectedRide+" for requested ride :"+requestedRide);
            return selectedRide.get();
        }
        System.out.println("Ride not found for requested ride :"+requestedRide);
        return null;
    }


}
