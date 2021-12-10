package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class Comment implements Model {
    private int id;
    private int userId;
    private String text;
    private int aboutId;


    public Comment(int id, int userId, String text, int aboutId) {
        this.id = id;
        this.userId = userId;
        this.text = text;
        this.aboutId = aboutId;
    }

    public Comment() {
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
