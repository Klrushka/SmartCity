package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

import java.sql.Timestamp;

public class Comment implements Model {
    private int id;
    private int userId;
    private String text;
    private int aboutId;
    private String userName;
    private Timestamp time;


    public Comment(int id, int userId, String text, int aboutId, String userName, Timestamp time) {
        this.id = id;
        this.userId = userId;
        this.text = text;
        this.aboutId = aboutId;
        this.userName = userName;
        this.time = time;
    }

    public Comment(int userId, String text, int aboutId, String userName, Timestamp time) {
        this.userId = userId;
        this.text = text;
        this.aboutId = aboutId;
        this.userName = userName;
        this.time = time;
    }

    public Comment() {
    }


    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAboutId() {
        return aboutId;
    }

    public void setAboutId(int aboutId) {
        this.aboutId = aboutId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
