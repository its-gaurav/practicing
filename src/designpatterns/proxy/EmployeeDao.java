/**
 * EmployeeDao.java

 */
package proxy;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public interface EmployeeDao {

    void createEmployee(String userType);

    void updateEmployee(String userType);

    void getEmployee(String userType);
}
