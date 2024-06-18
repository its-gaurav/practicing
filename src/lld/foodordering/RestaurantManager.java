package lld.foodordering;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RestaurantManager {
    private List<Restaurant> restaurants;
    private List<Item> items;
    private RestaurantSelectionStrategy selectionStrategy;

    public RestaurantManager(List<Restaurant> restaurants, List<Item> items) {
        this.restaurants = restaurants;
        this.items = items;
        this.selectionStrategy = new BestRatingStrategy();
    }

    public Restaurant orderItems(Map<Item, Integer> quantityWiseItems) {
        Restaurant restaurant = selectionStrategy.findRestaurant(this.restaurants, new ArrayList<>(quantityWiseItems.keySet()));
        Integer orderNumber = getNewOrderNumber(restaurant);
        restaurant.acceptOrder(orderNumber);
        System.out.println("Order assigned to "+restaurant.getName());
        restaurant.updateOrderStatus(orderNumber, "COMPLETED");
        return restaurant;
    }

    private Integer getNewOrderNumber(Restaurant restaurant) {
        if (restaurant.getOrderStatus().size() > 0) {
            return (Integer) restaurant.getOrderStatus().keySet().stream().toArray()[restaurant.getOrderStatus().size()-1]+1;
        }
        return 1;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void rateARestaurant(Restaurant restaurant, double rating) {
        restaurant.setRatings(rating);
    }

    public void updateMenu(Restaurant restaurant, Item item) {
        Item itemToUpdate = restaurant.getMenu()
                .stream()
                .filter(menuItem -> item.getName().equalsIgnoreCase(menuItem.getName()))
                .findAny().orElseThrow(() -> new RuntimeException("Item Not Found To Update"));
        itemToUpdate.setPrice(item.getPrice());
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public RestaurantSelectionStrategy getSelectionStrategy() {
        return selectionStrategy;
    }

    public void setSelectionStrategy(RestaurantSelectionStrategy selectionStrategy) {
        this.selectionStrategy = selectionStrategy;
    }
}
