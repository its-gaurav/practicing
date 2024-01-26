/**
 * SharedResource.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package lockbasedconcurrency.withoutconcurrency;

/**
 * @author gauravraj01
 * @version 1.0, 23-01-2024
 * @since OpenJDK 17
 */
public class SharedResource {
    private int counter = 0;

    public int incrementCounter() {
        return counter++; // it involves 3 operations which are fetching value, incrementing it and assigning it back.
    }

    public int getCounter() {
        return counter;
    }
}
