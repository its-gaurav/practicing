/**
 * EmailObserver.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package stockobserver;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public class EmailObserver extends Observer{

    private String identifier;
    private String emailId;

    public EmailObserver(String identifier, String emailId) {
        this.identifier = identifier;
        this.emailId = emailId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    @Override
    void sendAlert(Observable observable) {
        System.out.printf("Item %s %s is now in stock. Alert has been sent to emailId %s",
                observable.brandName, observable.modelName, this.emailId);
        System.out.println();
    }
}
