package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.Hotel;
import com.smartcity.smartcity.Models.House;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelInsertRequest {
    private static final String REQUEST = "INSERT smartcity.hotels (name, rating, address, about_id) VALUES (?,?,?,?)";

    public static void execute (Hotel hotel){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);


            statement.setString(1,hotel.getName());
            statement.setInt(2,hotel.getRating());
            statement.setString(3,hotel.getAddress());
            statement.setInt(4,hotel.getAboutId());

            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

