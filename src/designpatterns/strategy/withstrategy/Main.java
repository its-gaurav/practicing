/**
 * Main.java

 */
package strategy.withstrategy;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public class Main {
    public static void main(String[] args) {
        DrivingStrategy normalStrategy = new NormalDrivingStrategy();
        Vehicle passengerVehicle = new PassengerVehicle(normalStrategy);

        DrivingStrategy sportStrategy = new SportDrivingStrategy();
        Vehicle offRoadVehicle = new OffRoadVehicle(sportStrategy);
        Vehicle sportsVehicle = new SportsVehicle(sportStrategy);

        passengerVehicle.drive();
        offRoadVehicle.drive();
        sportsVehicle.drive();
    }
}
