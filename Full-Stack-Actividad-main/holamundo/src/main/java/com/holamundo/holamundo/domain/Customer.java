package com.holamundo.holamundo.domain;

public class Customer{
    
    private int ID;
    private String Name;
    private String username;
    private String password;


    public Customer(int iD, String name, String username, String password) {
        ID = iD;
        Name = name;
        this.username = username;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
