/**
 * Main.java

 */
package chainofresponsibilities.levelengineers;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class Main {
    public static void main(String[] args) {
        Engineer level1Engineer = new Level1Engineer();
        Engineer level2Engineer = new Level2Engineer();
        Engineer level3Engineer = new Level3Engineer();

        level1Engineer.assignEngineer(level2Engineer);
        level2Engineer.assignEngineer(level3Engineer);

        level1Engineer.performTask("task1");
        level1Engineer.performTask("task2");
        level1Engineer.performTask("task3");
        level1Engineer.performTask("task4");

    }
}
