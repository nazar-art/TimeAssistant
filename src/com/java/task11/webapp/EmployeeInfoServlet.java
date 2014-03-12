package com.java.task11.webapp;

import com.java.task11.controller.service.EmployeeService;
import com.java.task11.model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author nlelyak
 * @version 1.00 2014-03-12
 */
@WebServlet("/employeeinfo")
public class EmployeeInfoServlet extends HttpServlet {

    EmployeeService employeeService = new EmployeeService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int emplId = Integer.parseInt(request.getParameter("info"));

        Employee employee = employeeService.getByID(emplId);

        request.setAttribute("employeeInfo", employee);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("employeeinfo.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
