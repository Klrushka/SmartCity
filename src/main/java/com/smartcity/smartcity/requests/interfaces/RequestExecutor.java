package com.smartcity.smartcity.requests.interfaces;

import com.smartcity.smartcity.Models.interfaces.Model;

import java.sql.ResultSet;

public interface RequestExecutor {
    void execute(String request);
    ResultSet executeResultSet(String request);
}
