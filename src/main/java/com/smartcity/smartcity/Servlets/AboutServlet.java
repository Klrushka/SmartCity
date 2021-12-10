package com.smartcity.smartcity.Servlets;

import com.smartcity.smartcity.Models.About;
import com.smartcity.smartcity.Models.Comment;
import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.requests.RequestExecutorImp;
import com.smartcity.smartcity.requests.interfaces.RequestExecutor;
import com.smartcity.smartcity.requests.select.AboutSelectRequest;
import com.smartcity.smartcity.requests.select.CommentSelectRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "AboutServlet", value = "/AboutServlet")
public class AboutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        User user = (User) session.getAttribute("user");

        ArrayList<Comment> comments = new ArrayList<>();

        RequestExecutor executor = new RequestExecutorImp();

        CommentSelectRequest comSelect = new CommentSelectRequest();

        AboutSelectRequest aboSelect = new AboutSelectRequest();

        ResultSet resultSet = executor.executeResultSet(
                aboSelect.getRequest(request.getParameter("topicId")));

        About about = null;

        try {

            if (resultSet.next()) {

                about = new About(
                        resultSet.getInt("id"),
                        resultSet.getString("text")
                );
            }


            resultSet = executor.executeResultSet(
                    comSelect.getRequest(request.getParameter("topicId")));


            while (resultSet.next()) {
                Comment comment = new Comment(
                        resultSet.getInt("id"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("text"),
                        resultSet.getInt("topic_id")
                );


                comments.add(comment);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }


        request.setAttribute("comments",comments);
        request.setAttribute("about",about);

        if (user.getAccess().equals("admin")){
            //TODO ADMin PAGE
            getServletContext().getRequestDispatcher("/about-page.jsp").forward(request,response);
        } else {
            getServletContext().getRequestDispatcher("/about-page.jsp").forward(request,response);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
