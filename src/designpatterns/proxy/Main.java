package proxy;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDaoProxy();
        employeeDao.createEmployee("ADMIN");
        employeeDao.updateEmployee("ADMIN");
        employeeDao.getEmployee("USER");
        employeeDao.createEmployee("USER");
    }
}