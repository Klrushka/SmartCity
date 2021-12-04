package com.smartcity.smartcity.Models;

import com.smartcity.smartcity.Models.interfaces.Model;

import java.sql.Date;

public class User implements Model {
    private int id;
    private Date birthday;
    private String phone;
    private String password;
    private String status;
    private String name;
    private String mail;
    private String access;

    public User(int id, Date birthday, String phone, String password, String status, String name, String mail, String access) {
        this.id = id;
        this.birthday = birthday;
        this.phone = phone;
        this.password = password;
        this.status = status;
        this.name = name;
        this.mail = mail;
        this.access = access;

    }

    public User( Date birthday, String phone, String password, String status, String name, String mail, String access) {
        this.birthday = birthday;
        this.phone = phone;
        this.password = password;
        this.status = status;
        this.name = name;
        this.mail = mail;
        this.access = access;
    }

    public User() {
    }


    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
