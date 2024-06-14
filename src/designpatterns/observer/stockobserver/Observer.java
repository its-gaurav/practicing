/**
 * Observer.java

 */
package observer.stockobserver;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public abstract class Observer {
    abstract void sendAlert(Observable observable);
}
