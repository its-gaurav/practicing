/**
 * Main.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package lockfreeconcurrency.withconcurrency;

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
        System.out.println("Final Counter (When Single Thread) Is: "+sharedResource.getCounter().get());

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

        System.out.println("Final Counter (When Multiple Threads) Is: "+sharedResource2.getCounter().get());
    }
}
