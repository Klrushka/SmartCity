package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.House;
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

@WebServlet(name = "TransportServlet", value = "/TransportServlet")
public class TransportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        RequestExecutor executor = new RequestExecutorImp();

        AllSelectRequest selectRequest = new AllSelectRequest();

        ResultSet resultSet = executor.executeResultSet(selectRequest.getRequest(Tables.TRANSPORT.getValue()));

        ArrayList<Transport> transports = new ArrayList<>();

        try {
            while (resultSet.next()) {

                Transport transport = new Transport(
                        resultSet.getInt("id"),
                        resultSet.getString("type"),
                        resultSet.getInt("number"),
                        resultSet.getString("root_name"),
                        resultSet.getInt("about_id")
                );

                transports.add(transport);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        request.setAttribute("transports",transports);

        if (user.getAccess().equals("admin")){
            //TODO ADMin PAGE
            getServletContext().getRequestDispatcher("/transport.jsp").forward(request,response);
        } else {
            getServletContext().getRequestDispatcher("/transport.jsp").forward(request,response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
