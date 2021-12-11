package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.About;
import com.smartcity.smartcity.Models.Hotel;
import com.smartcity.smartcity.Models.House;
import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.requests.RequestExecutorImp;
import com.smartcity.smartcity.requests.insert.AboutInsertRequest;
import com.smartcity.smartcity.requests.insert.HouseInsertRequest;
import com.smartcity.smartcity.requests.interfaces.RequestExecutor;
import com.smartcity.smartcity.requests.select.AboutMaxId;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "AddHotelServlet", value = "/AddHotelServlet")
public class AddHotelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        if (user.getAccess().equals("admin")) {
            getServletContext().getRequestDispatcher("/add-hotel.jsp").forward(request, response);
        } else {
            // TODO ERROR PAGE
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestExecutor executor = new RequestExecutorImp();

        AboutMaxId aboutMaxId = new AboutMaxId();

        ResultSet resultSet = executor.executeResultSet(aboutMaxId.getRequest());

        About about = null;

        try {

            if (resultSet.next()) {
                about = new About(
                        resultSet.getInt(1) + 1,
                        request.getParameter("about")
                );
            }

            AboutInsertRequest.execute(about);

            Hotel hotel = new Hotel(
                    request.getParameter("name"),
                    Integer.parseInt(request.getParameter("rating")),
                    request.getParameter("address"),
                    about.getId()
            );

            executor.addData(hotel);


        } catch (SQLException e) {
            e.printStackTrace();
        }


        getServletContext().getRequestDispatcher("/add-hotel.jsp").forward(request, response);
    }

}
