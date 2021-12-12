package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.Hotel;
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

@WebServlet(name = "HotelsServlet", value = "/HotelsServlet")
public class HotelsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        RequestExecutor executor = new RequestExecutorImp();

        AllSelectRequest selectRequest = new AllSelectRequest();

        ResultSet resultSet = executor.executeResultSet(selectRequest.getRequest(Tables.HOTELS.getValue()));

        ArrayList<Hotel> hotels = new ArrayList<>();

            try {
                while (resultSet.next()) {

                    Hotel hotel = new Hotel(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getInt("rating"),
                            resultSet.getString("address"),
                            resultSet.getInt("about_id")
                    );

                    hotels.add(hotel);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


            request.setAttribute("hotels",hotels);

            if (user.getAccess().equals("admin")){
                //TODO ADMin PAGE
                getServletContext().getRequestDispatcher("/hotels.jsp").forward(request,response);
            } else {
                getServletContext().getRequestDispatcher("/hotels.jsp").forward(request,response);

            }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
