package lld.foodordering;

import java.util.*;

public class Restaurant {
    private String name;
    private Set<Item> menu;
    private int maxOrdersToProcess;

    private double ratings;
    private Map<Integer, String> orderStatus;

    public Restaurant(String name, Set<Item> menu, int maxOrdersToProcess, double ratings) {
        this.name = name;
        this.menu = menu;
        this.maxOrdersToProcess = maxOrdersToProcess;
        this.ratings = ratings;
        this.orderStatus = new LinkedHashMap<>();
    }

    void updateOrderStatus(Integer orderNo, String status) {
        System.out.println("Order "+orderNo+" has been marked "+status);
        orderStatus.put(orderNo, status);
        if (status == "ACCEPTED") {
            maxOrdersToProcess--;
        } else if (status == "COMPLETED") {
            maxOrdersToProcess++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getMenu() {
        return menu;
    }

    public void setMenu(HashSet<Item> menu) {
        this.menu = menu;
    }

    public int getMaxOrdersToProcess() {
        return maxOrdersToProcess;
    }

    public void setMaxOrdersToProcess(int maxOrdersToProcess) {
        this.maxOrdersToProcess = maxOrdersToProcess;
    }

    public Map<Integer, String> getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Map<Integer, String> orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    public void acceptOrder(Integer orderNumber) {
        this.updateOrderStatus(orderNumber, "ACCEPTED");
    }
}
