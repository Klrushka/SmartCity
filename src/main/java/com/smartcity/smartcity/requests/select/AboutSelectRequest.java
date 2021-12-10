package com.smartcity.smartcity.requests.select;

import com.smartcity.smartcity.requests.interfaces.SelectRequest;

public class AboutSelectRequest implements SelectRequest {

    @Override
    public String getRequest(String... params) {
        StringBuffer buffer = new StringBuffer();

        buffer
                .append("SELECT * FROM about WHERE id = ")
                .append(params[0]);


        return buffer.toString();
    }
}
