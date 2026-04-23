package com.employee.controller;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmail(email);
        emp.setDepartment(department);
        emp.setSalary(salary);

        EmployeeDAO dao = new EmployeeDAO();
        boolean status = dao.registerEmployee(emp);

        if (status) {
            response.sendRedirect("success.jsp");
        } else {
            response.getWriter().println("Error in Registration");
        }
    }
}
