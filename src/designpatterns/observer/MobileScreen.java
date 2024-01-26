/**
 * MobileScreen.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package observer;

/**
 * @author gauravraj01
 * @version 1.0, 17-01-2024
 * @since OpenJDK 17
 */

public class MobileScreen implements Observer{

    private String observerId;

    public MobileScreen(String observerId) {
        this.observerId = observerId;
    }

    @Override
    public void update(int temperature) {
        System.out.printf("Mobile Screen %s -> Displaying temperature %d", observerId, temperature);
        System.out.println();
    }
}
