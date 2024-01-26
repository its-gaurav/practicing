/**
 * SharedResource.java

 */
package lockfreeconcurrency.withconcurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author gauravraj01
 * @version 1.0, 23-01-2024
 * @since OpenJDK 17
 */
public class SharedResource {
    private AtomicInteger counter = new AtomicInteger(0); // provides concurrency

    public int incrementCounter() {
        return counter.getAndIncrement(); // it is a single operation
    }

    public AtomicInteger getCounter() {
        return counter;
    }
}
