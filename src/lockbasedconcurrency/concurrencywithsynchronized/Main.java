/**
 * Main.java

 */
package lockbasedconcurrency.concurrencywithsynchronized;

/**
 * @author gauravraj01
 * @version 1.0, 23-01-2024
 * @since OpenJDK 17
 */
public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        for (int i=0; i<4000; i++) {
            sharedResource.incrementCounter();
        }
        System.out.println("Final Counter (When Single Thread) Is: "+sharedResource.getCounter());

        SharedResource sharedResource2 = new SharedResource();

        Thread th1 = new Thread(() -> {
            for (int i=0; i<2000; i++) {
                sharedResource2.incrementCounter();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i=0; i<2000; i++) {
                sharedResource2.incrementCounter();
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {

        }

        System.out.println("Final Counter (When Multiple Threads) Is: "+sharedResource2.getCounter());
    }
}
