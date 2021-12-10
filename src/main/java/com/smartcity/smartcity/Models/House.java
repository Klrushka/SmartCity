package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class House implements Model {
    private int id;
    private int rating;
    private String address;
    private int floors;
    private int flats;
    private int aboutId;


    public House(int id, int rating, String address, int floors, int flats, int aboutId) {
        this.id = id;
        this.rating = rating;
        this.address = address;
        this.floors = floors;
        this.flats = flats;
        this.aboutId = aboutId;
    }
  public House(int rating, String address, int floors, int flats, int aboutId) {
        this.rating = rating;
        this.address = address;
        this.floors = floors;
        this.flats = flats;
        this.aboutId = aboutId;
    }

    public House() {
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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getFlats() {
        return flats;
    }

    public void setFlats(int flats) {
        this.flats = flats;
    }
}
