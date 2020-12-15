package com.example.wyromedapp.Model;

public class OrderRentalItem {
    private String namaBarang;

    public OrderRentalItem(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
}
