/**
 * FourWheeler.java

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
