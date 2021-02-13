package com.soul.java.apidemo.entity;

public class User {
   public String username;
   public int password;
   public String phone;

   public User() {

   }
   /*init构造方法*/
   public User (String username, int password, String phone){
       this.username = username;
       this.password = password;
       this.phone = phone;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User:{" +
                "name='" + this.getUsername() + '\'' +
                ", password=" + this.getPassword() +'\''+
                ", phoneNum=" + this.getPhone() +'\''+
                '}';
    }
}
