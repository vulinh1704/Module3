package controller;

import demo2005.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = "/students")
public class StudentServlet extends HttpServlet {
    StudentDAO studentDAO = new StudentDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = studentDAO.findAll();
        String sort = request.getParameter("product/sort");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/demo.jsp");
        if(sort != null){
            students = studentDAO.findAllByOrder();
        }
        request.setAttribute("list", students);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
