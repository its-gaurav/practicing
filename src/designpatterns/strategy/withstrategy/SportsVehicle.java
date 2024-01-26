/**
 * FourWheeler.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package strategy.withstrategy;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */

public class SportsVehicle implements Vehicle {

    private DrivingStrategy strategy;

    public SportsVehicle(DrivingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void drive() {
        strategy.drive();
    }
}
