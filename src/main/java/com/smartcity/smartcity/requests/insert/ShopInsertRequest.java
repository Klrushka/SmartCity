package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.Shop;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShopInsertRequest {
    private static final String REQUEST = "INSERT smartcity.shops  (name, type, address, rating, about_id) VALUES (?,?,?,?,?)";

    public static void execute (Shop shop){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);


            statement.setString(1,shop.getName());
            statement.setString(2,shop.getType());
            statement.setString(3,shop.getAddress());
            statement.setInt(4,shop.getRating());
            statement.setInt(5,shop.getAboutId());

            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
