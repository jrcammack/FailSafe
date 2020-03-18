package com.example.sharedpref;

public class Account {

    private String username;
    private String accountname;
    private String URL;
    private String password;

    public Account(String username, String accountname, String URL, String password) {
        this.username = username;
        this.accountname = accountname;
        this.URL = URL;
        this.password = password;
    }

    public String toString() {
        return "username = "+username+" accountname = "+accountname+" URL = "+URL+" password = "+password;
    }
}