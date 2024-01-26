/**
 * MobileObservable.java

 */
package stockobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */

public class MobileObservable extends Observable {

    private List<Observer> observerList;

    public MobileObservable(String identifier, String brandName, String modelName, boolean isStockAvailable) {
        this.identifier = identifier;
        this.brandName = brandName;
        this.modelName = modelName;
        this.isStockAvailable = isStockAvailable;
        this.observerList = new ArrayList<>();
    }

    @Override
    void addSubscriber(Observer observer) {
        observerList.add(observer);
    }

    @Override
    void removeSubscriber(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    void updateStockStatus(boolean isStockAvailable) {
        this.isStockAvailable = isStockAvailable;
        System.out.println("stock status is "+isStockAvailable);
        if (isStockAvailable) {
            notifyAllObservers();
        }
    }

    @Override
    void notifyAllObservers() {
        observerList.forEach(observer -> {
            observer.sendAlert(this);
        });
    }
}
