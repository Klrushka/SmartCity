package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.Hotel;
import com.smartcity.smartcity.Models.Park;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParkInsertRequest {
    private static final String REQUEST = "INSERT smartcity.parks (address, rating, about_id) VALUES (?,?,?)";

    public static void execute (Park park){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);


            statement.setString(1,park.getAddress());
            statement.setInt(2,park.getRating());
            statement.setInt(3,park.getAboutId());

            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
