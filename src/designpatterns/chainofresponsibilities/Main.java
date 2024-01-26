/**
 * Main.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package chainofresponsibilities;

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
