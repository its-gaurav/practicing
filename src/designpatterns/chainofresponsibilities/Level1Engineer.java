/**
 * Level1Engineer.java
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
