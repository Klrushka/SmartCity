package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.Comment;
import com.smartcity.smartcity.Models.Hotel;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CommentInsertRequest {
    private static final String REQUEST = "INSERT smartcity.comments (user_id, text, about_id, user_name, time) VALUES (?,?,?,?,?)";

    public static void execute (Comment comment){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);

            statement.setInt(1,comment.getUserId());
            statement.setString(2,comment.getText());
            statement.setInt(3,comment.getAboutId());
            statement.setString(4,comment.getUserName());
            statement.setTimestamp(5,comment.getTime());

            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
