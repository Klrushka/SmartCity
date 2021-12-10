package com.smartcity.smartcity.requests.select;

import com.smartcity.smartcity.requests.interfaces.SelectRequest;

public class AboutMaxId implements SelectRequest {
    @Override
    public String getRequest(String... params) {
        return "SELECT MAX(id) FROM about";
    }
}
