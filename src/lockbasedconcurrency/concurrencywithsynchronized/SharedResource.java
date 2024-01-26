/**
 * SharedResource.java

 */
package lockbasedconcurrency.concurrencywithsynchronized;

/**
 * @author gauravraj01
 * @version 1.0, 23-01-2024
 * @since OpenJDK 17
 */
public class SharedResource {
    private int counter = 0;

    public synchronized int incrementCounter() {
        return counter++; // it involves 3 operations which are fetching value, incrementing it and assigning it back.
    }

    public int getCounter() {
        return counter;
    }
}
