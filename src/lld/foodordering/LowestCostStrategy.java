package lld.foodordering;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class LowestCostStrategy extends RestaurantSelectionStrategy{
    @Override
    public Restaurant findRestaurant(List<Restaurant> restaurants, List<Item> itemsSelected) {
        List<Restaurant> restaurantList = restaurants
                .stream()
                .filter(r -> r.getMaxOrdersToProcess() > 0)
                .filter(r -> serveAllItems(r.getMenu(), itemsSelected))
                .toList();

        Restaurant restaurantFound = null;
        double minPrice = Double.MAX_VALUE;
        for (Restaurant restaurant: restaurantList) {
            AtomicReference<Double> sum = new AtomicReference<>((double) 0);
            for (Item item: itemsSelected) {
                restaurant.getMenu().stream().filter(menuItem -> menuItem.equals(item)).findAny().ifPresent(menuItem -> {
                    sum.updateAndGet(v -> (v + menuItem.getPrice()));
                });
            }
            if (sum.get() < minPrice) {
                restaurantFound = restaurant;
                minPrice = sum.get();
            }
        }

        if (restaurantFound == null) {
            throw new RuntimeException("Restaurant Not Found");
        }
        System.out.println("Min price calculated "+minPrice);
        return restaurantFound;
    }
}
