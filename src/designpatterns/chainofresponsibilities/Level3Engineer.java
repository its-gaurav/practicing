/**
 * Level3Engineer.java

 */
package chainofresponsibilities;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class Level3Engineer extends Engineer{

    @Override
    public void performTask(String taskName) {
        if (taskName.equalsIgnoreCase("task3")) {
            System.out.println(taskName + " performed by level 3 engineer");
        }else {
            System.out.println(taskName + " cannot be performed by level 3 engineer");
            System.out.println("invalid task");
        }
    }
}
