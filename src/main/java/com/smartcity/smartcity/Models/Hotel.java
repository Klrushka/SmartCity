package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class Hotel implements Model {
    private int id;
    private String name;
    private int rating;
    private String address;
    private int aboutId;

    public Hotel(int id, String name, int rating, String address, int aboutId) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.address = address;
        this.aboutId = aboutId;
    }

    public int getAboutId() {
        return aboutId;
    }

    public void setAboutId(int aboutId) {
        this.aboutId = aboutId;
    }

    public Hotel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
