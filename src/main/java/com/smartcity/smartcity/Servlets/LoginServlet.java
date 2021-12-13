package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.requests.RequestExecutorImp;
import com.smartcity.smartcity.requests.interfaces.RequestExecutor;
import com.smartcity.smartcity.requests.interfaces.SelectRequest;
import com.smartcity.smartcity.requests.select.UserSelectRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login-page.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        HttpSession session = request.getSession();

        RequestExecutor executor = new RequestExecutorImp();

        SelectRequest selectRequest = new UserSelectRequest();

        ResultSet resultSet = executor.executeResultSet(selectRequest.getRequest(
                request.getParameter("email"),
                request.getParameter("password")
        ));

        User user = null;


        try {
            if (resultSet.next()) {
                user = new User(
                        resultSet.getInt("id"),
                        resultSet.getDate("birthday"),
                        resultSet.getString("phone"),
                        resultSet.getString("password"),
                        resultSet.getString("status"),
                        resultSet.getString("name"),
                        resultSet.getString("mail"),
                        resultSet.getString("access")
                );

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        if (user == null || user.getStatus().equals("ban") || user.getStatus().equals("waiting")){
            //TODO "ERROR PAGE"
        } else if (user.getAccess().equals("admin")) {
            session.setAttribute("user",user);
            response.sendRedirect("MainServlet");
        } else {
            session.setAttribute("user",user);
            response.sendRedirect("MainServlet");
        }


    }
}
