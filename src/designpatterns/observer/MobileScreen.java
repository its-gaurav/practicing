/**
 * MobileScreen.java

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
