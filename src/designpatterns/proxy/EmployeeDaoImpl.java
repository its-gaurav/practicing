/**
 * EmployeeDaoImpl.java

 */
package proxy;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public void createEmployee(String userType) {
        System.out.println("Creating Employee");
    }

    @Override
    public void updateEmployee(String userType) {
        System.out.println("Updating Employee");
    }

    @Override
    public void getEmployee(String userType) {
        System.out.println("Getting Employee");
    }
}
