package org.deepwater.daisy.entity.user;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPhone;

    private String userPassword;

    private Date userCreatedata;

    private String userAvator;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getUserCreatedata() {
        return userCreatedata;
    }

    public void setUserCreatedata(Date userCreatedata) {
        this.userCreatedata = userCreatedata;
    }

    public String getUserAvator() {
        return userAvator;
    }

    public void setUserAvator(String userAvator) {
        this.userAvator = userAvator == null ? null : userAvator.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userCreatedata=" + userCreatedata +
                ", userAvator='" + userAvator + '\'' +
                '}';
    }
}