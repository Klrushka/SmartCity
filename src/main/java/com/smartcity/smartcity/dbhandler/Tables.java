package com.smartcity.smartcity.dbhandler;

public enum Tables {
    ATM("atm"),
    COMMENTS("comments"),
    HOTELS("hotels"),
    HOUSES("houses"),
    PARKS("parks"),
    SHOPS("shops"),
    TRANSPORT("transport"),
    USERS("users");

    Tables(String s) {
        value = s;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
