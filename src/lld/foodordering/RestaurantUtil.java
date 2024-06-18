package lld.foodordering;

import java.util.*;

public class RestaurantUtil {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Paneer Butter Masala"));
        items.add(new Item("Kulchha"));
        items.add(new Item("Mushroom Masala"));
        items.add(new Item("Roti"));
        items.add(new Item("Tawa Paneer"));
        items.add(new Item("Jira Rice"));
        items.add(new Item("Punjabi Chicken"));

        Set<Item> menu1 = new HashSet<>();
        menu1.add(new Item("Paneer Butter Masala", 130));
        menu1.add(new Item("Kulchha", 25));
        menu1.add(new Item("Mushroom Masala", 140));
        menu1.add(new Item("Roti", 20));
        Restaurant chatkara = new Restaurant("Chatkara", menu1, 4, 0.9);

        Set<Item> menu2 = new HashSet<>();
        menu2.add(new Item("Paneer Butter Masala", 120));
        menu2.add(new Item("Kulchha", 25));
        menu2.add(new Item("Mushroom Masala", 135));
        menu2.add(new Item("Roti", 20));
        Restaurant ccd = new Restaurant("Chulha Chauki Da Dhaba", menu2, 4, 0.8);

        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(chatkara);
        restaurants.add(ccd);

        RestaurantManager restaurantManager = new RestaurantManager(restaurants, items);

        // creating order request
        Map<Item, Integer> orderRequest1 = new HashMap<>();
        orderRequest1.put(new Item("Roti"), 5);
        orderRequest1.put(new Item("Paneer Butter Masala"), 1);
        restaurantManager.setSelectionStrategy(new BestRatingStrategy());
        restaurantManager.orderItems(orderRequest1);

        // creating order request
        Map<Item, Integer> orderRequest2 = new HashMap<>();
        orderRequest2.put(new Item("Roti"), 5);
        orderRequest2.put(new Item("Paneer Butter Masala"), 1);
        restaurantManager.setSelectionStrategy(new LowestCostStrategy());
        restaurantManager.orderItems(orderRequest2);
    }
}
