package com.example.wyromedapp.Model;

public class InUseItem {
    private String namaBarang;
    private String countTimer;

    public InUseItem(String namaBarang, String countTimer) {
        this.namaBarang = namaBarang;
        this.countTimer = countTimer;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getCountTimer() {
        return countTimer;
    }

    public void setCountTimer(String countTimer) {
        this.countTimer = countTimer;
    }
}
