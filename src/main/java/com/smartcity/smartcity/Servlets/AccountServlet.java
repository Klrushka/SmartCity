package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.requests.RequestExecutorImp;
import com.smartcity.smartcity.requests.insert.UserInsertRequest;
import com.smartcity.smartcity.requests.interfaces.RequestExecutor;
import com.smartcity.smartcity.requests.select.UserSelectRequest;
import com.smartcity.smartcity.requests.update.UserUpdateRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "AccountServlet", value = "/AccountServlet")
public class AccountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        if (request.getParameter("userId") == null) {
            request.setAttribute("user1", user);
        } else {
            RequestExecutor executor = new RequestExecutorImp();

            ResultSet resultSet = executor.executeResultSet(UserSelectRequest.getUserById(
                    request.getParameter("userId")));

            try {
                if (resultSet.next()){

                    User user1 = new User(
                            resultSet.getInt("id"),
                            resultSet.getDate("birthday"),
                            resultSet.getString("phone"),
                            resultSet.getString("password"),
                            resultSet.getString("status"),
                            resultSet.getString("name"),
                            resultSet.getString("mail"),
                            resultSet.getString("access")
                    );


                    request.setAttribute("user1",user1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }

        if (user.getAccess().equals("admin")) {
            getServletContext().getRequestDispatcher("/account-editmode-admin.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/account-editmode.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User(
                Integer.parseInt(request.getParameter("id")),
                Date.valueOf(request.getParameter("birthday")),
                request.getParameter("phone"),
                request.getParameter("password"),
                request.getParameter("status"),
                request.getParameter("name"),
                request.getParameter("mail"),
                request.getParameter("access")
        );

        UserUpdateRequest.execute(user);


        response.sendRedirect("login");
    }
}
