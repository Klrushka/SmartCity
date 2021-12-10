package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class Park implements Model {
    private int id;
    private String address;
    private int rating;
    private int aboutId;

    public Park(int id, String address, int rating, int aboutId) {
        this.id = id;
        this.address = address;
        this.rating = rating;
        this.aboutId = aboutId;
    }

    public Park() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
