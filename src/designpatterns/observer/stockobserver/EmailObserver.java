/**
 * EmailObserver.java

 */
package observer.stockobserver;

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
