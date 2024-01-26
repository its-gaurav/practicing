/**
 * Main.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package strategy.withoutstrategy;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */

public class Main {
    public static void main(String[] args) {
        Vehicle passengerVehicle = new PassengerVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();
        Vehicle sportsVehicle = new SportsVehicle();

        passengerVehicle.drive();
        offRoadVehicle.drive();
        sportsVehicle.drive();
    }
}
