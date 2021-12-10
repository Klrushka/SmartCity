package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.About;
import com.smartcity.smartcity.Models.House;
import com.smartcity.smartcity.Models.interfaces.Model;
import com.smartcity.smartcity.dbhandler.DBConnection;
import com.smartcity.smartcity.requests.interfaces.InsertRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AboutInsertRequest {

    private static final String REQUEST = "INSERT smartcity.about (id, text) VALUES (?,?)";

    public static void execute (About about){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);


            statement.setInt(1,about.getId());
            statement.setString(2,about.getText());

            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
