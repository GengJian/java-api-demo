package com.soul.java.apidemo.entity;

public class User {
   public String username;
   public int password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
