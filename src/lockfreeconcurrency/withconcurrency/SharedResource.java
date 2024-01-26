/**
 * SharedResource.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
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
