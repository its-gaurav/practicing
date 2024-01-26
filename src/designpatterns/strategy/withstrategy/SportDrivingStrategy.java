/**
 * SportDrivingStrategy.java

 */
package strategy.withstrategy;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public class SportDrivingStrategy implements DrivingStrategy{
    @Override
    public void drive() {
        System.out.println("Sport Driving");
    }
}
