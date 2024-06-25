/**
 * Level1Engineer.java

 */
package chainofresponsibilities.levelengineers;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class Level1Engineer extends Engineer{

    @Override
    public void performTask(String taskName) {
        if (taskName.equalsIgnoreCase("task1")) {
            System.out.println(taskName + " performed by level 1 engineer");
        }else {
            System.out.println(taskName + " cannot be performed by level 1 engineer");
            if (levelEngineer != null) {
                levelEngineer.performTask(taskName);
            }
        }
    }
}
