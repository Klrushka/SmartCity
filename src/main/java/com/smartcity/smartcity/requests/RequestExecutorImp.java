package com.smartcity.smartcity.requests;

import com.smartcity.smartcity.Models.interfaces.Model;
import com.smartcity.smartcity.dbhandler.DBConnection;
import com.smartcity.smartcity.requests.interfaces.RequestExecutor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestExecutorImp implements RequestExecutor {
    @Override
    public void execute(String request) {

        Connection connection = DBConnection.getConnection();

        try {
            PreparedStatement statement = connection.prepareStatement(request);

            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ResultSet executeResultSet(String request) {
        
        Connection connection = DBConnection.getConnection();

        ResultSet resultSet = null;

        try {
            PreparedStatement statement = connection.prepareStatement(request);

             resultSet = statement.executeQuery();


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultSet;

    }



}
