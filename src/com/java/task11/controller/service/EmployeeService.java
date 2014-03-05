package com.java.task11.controller.service;

import com.java.task11.controller.dao.DaoFactory;
import com.java.task11.controller.dao.EmployeeDao;
import com.java.task11.model.Employee;

import javax.servlet.http.HttpServlet;
import java.util.List;

/**
 * @author nlelyak
 * @version 1.00 2014-03-05
 */
public class EmployeeService implements IBaseService<Employee> {
    private EmployeeDao employeeDao = DaoFactory.getInstance().getEmployeeDao();

    @Override
    public Employee getByID(Integer id) {
        return employeeDao.getByID(id);
    }

    @Override
    public void save(Employee element) {
        employeeDao.save(element);
    }

    @Override
    public void update(Employee element) {
        employeeDao.update(element);
    }

    @Override
    public void delete(Employee element) {
        employeeDao.delete(element);
    }

    @Override
    public List<Employee> getListOfObjects() {
        return employeeDao.getListOfObjects();
    }

    public Employee getByEmail(String email) {
        List<Employee> employeeList = getListOfObjects();
        for (Employee empl : employeeList) {
            if (empl.getEmail().equalsIgnoreCase(email)) return empl;
        }
        return null;
    }

    public void delete(Integer userId, HttpServlet servlet) {
        Employee empl = getByID(userId);
        delete(empl, servlet);
    }

    public void delete(Employee empl, HttpServlet servlet) {
        delete(empl);
    }
}
