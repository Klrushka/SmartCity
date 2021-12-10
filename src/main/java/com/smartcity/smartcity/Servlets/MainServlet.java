package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MainServlet", value = "/MainServlet")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        if (user.getAccess().equals("admin")){
            getServletContext().getRequestDispatcher("/main-page-admin.jsp").forward(request,response);
        } else {
            getServletContext().getRequestDispatcher("/main-page.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
