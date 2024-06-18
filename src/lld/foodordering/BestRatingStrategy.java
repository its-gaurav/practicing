package lld.foodordering;

import java.util.Comparator;
import java.util.List;

public class BestRatingStrategy extends RestaurantSelectionStrategy{

    @Override
    public Restaurant findRestaurant(List<Restaurant> restaurants, List<Item> itemsSelected) {
        Restaurant restaurant =  restaurants
                .stream()
                .filter(r -> r.getMaxOrdersToProcess() > 0)
                .filter(r -> serveAllItems(r.getMenu(), itemsSelected))
                .max(Comparator.comparing(Restaurant::getRatings))
                .orElseThrow(() -> new RuntimeException("Restaurant Not Found"));

        return restaurant;
    }


}
