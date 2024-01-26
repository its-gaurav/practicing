/**
 * Observable.java

 */
package stockobserver;


/**
 * @author gauravraj01
 * @version 1.0, 20-01-2024
 * @since OpenJDK 17
 */
public abstract class Observable {

    protected String identifier;
    protected String brandName;
    protected String modelName;
    protected boolean isStockAvailable;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    abstract void addSubscriber(Observer observer);

    abstract void removeSubscriber(Observer observer);

    abstract void updateStockStatus(boolean isStockAvailable);

    abstract void notifyAllObservers();

}
