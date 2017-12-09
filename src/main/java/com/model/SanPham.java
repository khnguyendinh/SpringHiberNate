package com.model;

public class SanPham {
    private String tenSP;
    private String maSP;
    private double giaSP;

    public SanPham(String tenSP, String maSP, double giaSP) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
}
