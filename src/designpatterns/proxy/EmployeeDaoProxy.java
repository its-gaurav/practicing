/**
 * EmployeeDaoProxy.java
 * <p>
 * Copyright (c) 2023 Mercedes-Benz USA, LLC. All Rights Reserved.
 * <p>
 * This software is the confidential and proprietary information of Mercedes-Benz USA, LLC. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance with the terms you entered into with
 * Mercedes-Benz USA, LLC.
 */
package proxy;

/**
 * @author gauravraj01
 * @version 1.0, 09-01-2024
 * @since OpenJDK 17
 */
public class EmployeeDaoProxy implements EmployeeDao{

    private final EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String userType) {
        if (userType.equalsIgnoreCase("ADMIN")){
            employeeDao.createEmployee(userType);
        }else {
            throw new RuntimeException("UNAUTHORISED");
        }
    }

    @Override
    public void updateEmployee(String userType) {
        if (userType.equalsIgnoreCase("ADMIN")){
            employeeDao.updateEmployee(userType);
        }else {
            throw new RuntimeException("UNAUTHORISED");
        }
    }

    @Override
    public void getEmployee(String userType) {
        if (userType.equalsIgnoreCase("ADMIN") || userType.equalsIgnoreCase("USER")){
            employeeDao.getEmployee(userType);
        }else {
            throw new RuntimeException("UNAUTHORISED");
        }
    }
}
