package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

public class Transport implements Model {
    private int id;
    private String type;
    private int number;
    private String rootName;
    private int aboutId;


    public Transport(int id, String type, int number, String rootName, int aboutId) {
        this.id = id;
        this.type = type;
        this.number = number;
        this.rootName = rootName;
        this.aboutId = aboutId;
    }

    public Transport() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRootName() {
        return rootName;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName;
    }
}
