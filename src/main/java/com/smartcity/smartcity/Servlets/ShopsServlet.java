package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.Hotel;
import com.smartcity.smartcity.Models.Shop;
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
import java.util.Locale;

@WebServlet(name = "ShopsServlet", value = "/ShopsServlet")
public class ShopsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        RequestExecutor executor = new RequestExecutorImp();

        AllSelectRequest selectRequest = new AllSelectRequest();

        ResultSet resultSet = executor.executeResultSet(selectRequest.getRequest(Tables.SHOPS.getValue()));

        ArrayList<Shop> shops = new ArrayList<>();

        try {
            while (resultSet.next()) {

                Shop shop = new Shop(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("type"),
                        resultSet.getString("address"),
                        resultSet.getInt("rating"),
                        resultSet.getInt("about_id")
                );

                shops.add(shop);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        request.setAttribute("shops",shops);

        if (user.getAccess().equals("admin")){
            //TODO ADMin PAGE
            getServletContext().getRequestDispatcher("/shops.jsp").forward(request,response);
        } else {
            getServletContext().getRequestDispatcher("/shops.jsp").forward(request,response);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
