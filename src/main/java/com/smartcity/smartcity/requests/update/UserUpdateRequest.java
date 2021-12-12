package com.smartcity.smartcity.requests.update;

import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.dbhandler.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdateRequest {
    private static final String REQUEST = "UPDATE smartcity.users SET name = ?, " +
            "password = ?, birthday = ?, phone = ?, status = ?, mail = ?, access = ? WHERE id = ?";


    public static void execute(User user){

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(REQUEST);

            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            statement.setDate(3,user.getBirthday());
            statement.setString(4, user.getPhone());
            statement.setString(5,user.getStatus());
            statement.setString(6,user.getMail());
            statement.setString(7, user.getAccess());
            statement.setInt(8, user.getId());

            statement.execute();

            statement.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
