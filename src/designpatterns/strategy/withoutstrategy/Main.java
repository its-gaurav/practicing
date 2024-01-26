/**
 * Main.java

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
