package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.House;
import com.smartcity.smartcity.Models.Park;
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

@WebServlet(name = "ParksServlet", value = "/ParksServlet")
public class ParksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        RequestExecutor executor = new RequestExecutorImp();

        AllSelectRequest selectRequest = new AllSelectRequest();

        ResultSet resultSet = executor.executeResultSet(selectRequest.getRequest(Tables.PARKS.getValue()));

        ArrayList<Park> parks = new ArrayList<>();

        try {
            while (resultSet.next()) {

                Park park = new Park(
                        resultSet.getInt("id"),
                        resultSet.getString("address"),
                        resultSet.getInt("rating")
                );


                parks.add(park);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        request.setAttribute("parks",parks);

        if (user.getAccess().equals("admin")){
            //TODO ADMin PAGE
            getServletContext().getRequestDispatcher("/parks.jsp").forward(request,response);
        } else {
            getServletContext().getRequestDispatcher("/parks.jsp").forward(request,response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
