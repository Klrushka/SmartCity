package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.requests.RequestExecutorImp;
import com.smartcity.smartcity.requests.insert.UserInsertRequest;
import com.smartcity.smartcity.requests.interfaces.RequestExecutor;

import java.io.*;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "SignUp", value = "/sign-up")
public class RegistrationPageServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        getServletContext().getRequestDispatcher("/registration-page.jsp").forward(request, response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = new User
                (Date.valueOf(request.getParameter("birthday")),
                        request.getParameter("phone"),
                        request.getParameter("password"),
                        "waiting",
                        request.getParameter("name"),
                        request.getParameter("email"),
                        "client");

        RequestExecutor executor = new RequestExecutorImp();

        UserInsertRequest userRequest = new UserInsertRequest();

        executor.execute(userRequest.getRequest(user));

        session.setAttribute("user", user);

        response.sendRedirect("login");

    }
}