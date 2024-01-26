/**
 * FourWheeler.java

 */
package strategy.withoutstrategy;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */

public class SportsVehicle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Vehicle with sports driving capabilities");
    }
}
