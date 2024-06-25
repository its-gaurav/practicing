/**
 * Level2Engineer.java

 */
package chainofresponsibilities;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class Level2Engineer extends Engineer{

    @Override
    public void performTask(String taskName) {
        if (taskName.equalsIgnoreCase("task2")) {
            System.out.println(taskName + " performed by level 2 engineer");
        }else {
            System.out.println(taskName + " cannot be performed by level 2 engineer");
            if (levelEngineer != null) {
                levelEngineer.performTask(taskName);
            }
        }
    }
}
