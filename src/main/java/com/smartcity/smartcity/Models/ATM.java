package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class ATM implements Model {
    private int id;
    private String name;
    private String bank;
    private String address;
    private int rating;

    public ATM(int id, String name, String bank, String address, int rating) {
        this.id = id;
        this.name = name;
        this.bank = bank;
        this.address = address;
        this.rating = rating;
    }

    public ATM() {
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

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
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
