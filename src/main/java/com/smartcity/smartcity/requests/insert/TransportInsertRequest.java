package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.Park;
import com.smartcity.smartcity.Models.Transport;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransportInsertRequest {
    private static final String REQUEST = "INSERT smartcity.transport (type, number, root_name, about_id) VALUES (?,?,?,?)";

    public static void execute (Transport transport){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);

            statement.setString(1,transport.getType());
            statement.setInt(2,transport.getNumber());
            statement.setString(3,transport.getRootName());
            statement.setInt(4,transport.getAboutId());

            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
