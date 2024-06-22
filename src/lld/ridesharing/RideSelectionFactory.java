package lld.ridesharing;

import java.util.List;

public class RideSelectionFactory {

    private SelectionStrategy selectByModel;
    private SelectionStrategy selectByMostVacant;

    public SelectionStrategy getSelectionStrategy(List<RideDetails> offeredRides, String preferredModel) {
        if (null == preferredModel) {
            selectByMostVacant = new SelectByMostVacant(offeredRides);
            return selectByMostVacant;
        }
        selectByModel = new SelectByModel(offeredRides);
        return selectByModel;
    }

}
