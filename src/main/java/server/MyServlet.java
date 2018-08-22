package server;

import beans.MyBean;
import beans.Person;
import dao.PersonDAO;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MyServlet", urlPatterns = {"*.html"})
public class MyServlet extends HttpServlet {
    @EJB
    PersonDAO personDAO;

    @Resource(name = "jdbs/test1")
    DataSource ds;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getRequestURI().endsWith("/hello.html")) {
            List<Person> people = personDAO.getAllPeople();
            request.setAttribute("mybean", new MyBean(people));
            request.getRequestDispatcher("/hello.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

}

