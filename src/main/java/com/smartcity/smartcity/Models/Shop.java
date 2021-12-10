package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class Shop implements Model {
    private int id;
    private String name;
    private String type;
    private String address;
    private int rating;
    private int aboutId;

    public Shop(int id, String name, String type, String address, int rating, int aboutId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.rating = rating;
        this.aboutId = aboutId;
    }

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
