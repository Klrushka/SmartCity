package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class About implements Model {
    private int id;
    private String text;


    public About(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public About() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
