package com.smartcity.smartcity.requests.insert;

import com.smartcity.smartcity.Models.User;
import com.smartcity.smartcity.Models.interfaces.Model;
import com.smartcity.smartcity.requests.interfaces.InsertRequest;

public class UserInsertRequest implements InsertRequest {

    @Override
    public String getRequest(Model model) {

        if (!(model instanceof User)) {
            throw new IllegalArgumentException();
        } else {

            User user = (User) model;

            StringBuffer buffer = new StringBuffer();

            buffer
                    .append("INSERT INTO users (birthday, phone, password, status, name, mail, access) VALUES (")
                    .append("'").append(user.getBirthday()).append("'")
                    .append(", ")
                    .append("'").append(user.getPhone()).append("'")
                    .append(", ")
                    .append("'").append(user.getPassword()).append("'")
                    .append(", ")
                    .append("'").append(user.getStatus()).append("'")
                    .append(", ")
                    .append("'").append(user.getName()).append("'")
                    .append(", ")
                    .append("'").append(user.getMail()).append("'")
                    .append(", ")
                    .append("'").append(user.getAccess()).append("'")
                    .append(")");


            return buffer.toString();
        }
    }
}
