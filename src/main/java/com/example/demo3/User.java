package com.example.demo3;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User implements Serializable {
    String UserName;
    String Password;

    public User() {
    }

    public User(String UserName, String Password) {
        this.UserName = UserName;

        try {
            this.Password = this.hashing(Password);
        } catch (NoSuchAlgorithmException var4) {
            var4.printStackTrace();
        }

    }

    private String hashing(String pass) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(pass.getBytes());
        String str = new String(messageDigest.digest());
        return str;
    }

    public String getUserName() {
        return this.UserName;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    static User getUser() {
        User User = new User();
        return User;
    }

    public void setPassword(String Password) throws NoSuchAlgorithmException {
        this.Password = this.hashing(Password);
    }

    public String toString() {
        return null;
    }
}
