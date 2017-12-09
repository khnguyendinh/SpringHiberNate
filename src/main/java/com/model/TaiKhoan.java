package com.model;

public class TaiKhoan {
    private String userNam;
    private String password;

    public TaiKhoan(String userNam, String password) {
        this.userNam = userNam;
        this.password = password;
    }

    public TaiKhoan() {
    }

    public String getUserNam() {
        return userNam;
    }

    public void setUserNam(String userNam) {
        this.userNam = userNam;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
