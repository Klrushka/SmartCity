package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.House;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HouseInsertRequest {

    private static final String REQUEST = "INSERT smartcity.houses (address, rating, floors, flats, about_id) VALUES (?,?,?,?,?)";

    public static void execute (House house){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);

            statement.setString(1,house.getAddress());
            statement.setInt(2,house.getRating());
            statement.setInt(3,house.getFloors());
            statement.setInt(4,house.getFlats());
            statement.setInt(5,house.getAboutId());


            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
