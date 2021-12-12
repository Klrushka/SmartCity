package com.smartcity.smartcity.requests.select;

import com.smartcity.smartcity.requests.interfaces.SelectRequest;

import java.sql.Connection;

public class UserSelectRequest implements SelectRequest {


    /**
     * [0] - login
     * [1] - password
     * @param params
     * @return request
     */
    @Override
    public String getRequest(String... params) {

        StringBuffer buffer = new StringBuffer();

        buffer
                .append("SELECT * FROM users WHERE mail = ")
                .append("'").append(params[0]).append("'")
                .append(" AND password = ")
                .append("'").append(params[1]).append("'")
                .append(" AND status = 'confirmed'");


        return buffer.toString();


    }


    public static String getUserById(String... params){

        StringBuffer buffer = new StringBuffer();

        buffer
                .append("SELECT * FROM users WHERE id = ")
                .append(params[0]);


        return buffer.toString();
    }
}
