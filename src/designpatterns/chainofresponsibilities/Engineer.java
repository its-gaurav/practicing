/**
 * Engineer.java
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
public abstract class Engineer {

    protected Engineer levelEngineer;

    public void assignEngineer(Engineer levelEngineer){
        this.levelEngineer = levelEngineer;
    }

    public abstract void performTask(String taskName);
}
