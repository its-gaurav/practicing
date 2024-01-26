/**
 * WeatherStation.java
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gauravraj01
 * @version 1.0, 17-01-2024
 * @since OpenJDK 17
 */
public class WeatherStation implements Observable {
    private List<Observer> observerList;
    private int temperature;

    public WeatherStation() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void updateTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update(this.temperature);
        }
    }
}
