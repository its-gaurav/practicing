/**
 * MobilePhoneObserver.java

 */
package stockobserver;

/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public class MobilePhoneObserver extends Observer{

    private String identifier;
    private String mobileNumber;

    public MobilePhoneObserver(String identifier, String mobileNumber) {
        this.identifier = identifier;
        this.mobileNumber = mobileNumber;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    void sendAlert(Observable observable) {
        System.out.printf("Item %s %s is now in stock. Alert has been sent to mobile number %s",
                observable.brandName, observable.modelName, this.mobileNumber);
        System.out.println();
    }
}
