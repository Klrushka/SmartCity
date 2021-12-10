package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.Transport;
import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.dbhandler.Tables;
import com.smartcity.smartcity.requests.RequestExecutorImp;
import com.smartcity.smartcity.requests.interfaces.RequestExecutor;
import com.smartcity.smartcity.requests.select.AllSelectRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        RequestExecutor executor = new RequestExecutorImp();

        AllSelectRequest selectRequest = new AllSelectRequest();

        ResultSet resultSet = executor.executeResultSet(selectRequest.getRequest(Tables.USERS.getValue()));

        ArrayList<User> users = new ArrayList<>();

        try {
            while (resultSet.next()) {

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

                users.add(user1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        request.setAttribute("users", users);

        if (user.getAccess().equals("admin")) {
            //TODO ADMin PAGE
            getServletContext().getRequestDispatcher("/users.jsp").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/users.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
