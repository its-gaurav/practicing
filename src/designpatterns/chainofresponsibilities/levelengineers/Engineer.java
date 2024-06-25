/**
 * Engineer.java

 */
package chainofresponsibilities.levelengineers;

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
