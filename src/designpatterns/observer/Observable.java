/**
 * Observable.java

 */
package observer;

/**
 * @author gauravraj01
 * @version 1.0, 17-01-2024
 * @since OpenJDK 17
 */

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void updateTemperature(int temperature);

    void notifyObservers();
}
