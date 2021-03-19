package com.example.wyromedapp.Model;

public class OrderRentalItem {
    private String namaBarang;
    private String status;

    public OrderRentalItem(String namaBarang, String status) {
        this.namaBarang = namaBarang;
        this.status = status;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
