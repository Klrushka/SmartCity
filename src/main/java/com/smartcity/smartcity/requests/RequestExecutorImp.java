package com.smartcity.smartcity.requests;

import com.smartcity.smartcity.Models.*;
import com.smartcity.smartcity.Models.interfaces.Model;
import com.smartcity.smartcity.dbhandler.DBConnection;
import com.smartcity.smartcity.requests.insert.AboutInsertRequest;
import com.smartcity.smartcity.requests.insert.HouseInsertRequest;
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

    @Override
    public void addData(Model model) {

        if (model instanceof House) {
            HouseInsertRequest.execute((House) model);
        } else if (model instanceof Hotel) {

        } else if (model instanceof ATM) {

        } else if (model instanceof Park) {

        } else if (model instanceof Shop) {

        } else if (model instanceof Transport) {

        } else if (model instanceof About){
            AboutInsertRequest.execute((About) model);
        }
    }


}
