package lld.ridesharing;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SelectByMostVacant extends SelectionStrategy{

    public SelectByMostVacant(List<RideDetails> offeredRides) {
        super(offeredRides);
    }

    @Override
    RideDetails selectRide(RideDetails requestedRide) {

        List<RideDetails> filteredRideDetails = findEligibleOfferedRideDetails(requestedRide);

        Optional<RideDetails> mostVacantOfferedRide = filteredRideDetails.stream()
                .max(Comparator.comparingInt(RideDetails::getAvailableSeats));
        if (mostVacantOfferedRide.isPresent()) {
            mostVacantOfferedRide.get().getCoPassengers().add(requestedRide.getRequestedBy());
            System.out.println("Ride found :: Most vacant offered ride is "+mostVacantOfferedRide.get()+" found for requested ride :"+requestedRide);
            return mostVacantOfferedRide.get();
        } else {
            System.out.println("Could not find most vacant offered ride for requested ride: "+requestedRide);
            return null;
        }

    }


}
