package lld.foodordering;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class RestaurantSelectionStrategy {

    abstract Restaurant findRestaurant(List<Restaurant> restaurants, List<Item> itemsSelected);

    public boolean serveAllItems(Set<Item> menu, List<Item> itemsSelected) {
        for (Item item: itemsSelected) {
            if (!menu.contains(item)) {
                return false;
            }
        }
        return true;
    }
}
