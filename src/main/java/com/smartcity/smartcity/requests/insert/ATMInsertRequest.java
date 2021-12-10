package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.ATM;
import com.smartcity.smartcity.Models.Park;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ATMInsertRequest {
    private static final String REQUEST = "INSERT smartcity.atm (name, bank, address, about_id) VALUES (?,?,?,?)";

    public static void execute (ATM atm){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);


            statement.setString(1, atm.getName());
            statement.setString(2,atm.getBank());
            statement.setString(3,atm.getAddress());
            statement.setInt(4,atm.getAboutId());

            statement.execute();

            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
