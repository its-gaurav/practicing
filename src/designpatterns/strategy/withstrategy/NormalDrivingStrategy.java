/**
 * NormalDrivingStrategy.java

 */
package strategy.withstrategy;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public class NormalDrivingStrategy implements DrivingStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Driving");
    }
}
