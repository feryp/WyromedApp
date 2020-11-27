package com.example.wyromedapp.Model;

public class StockRequest {
    private String namaBarang;
    private int jumlahRequest;

    public StockRequest(String namaBarang, int jumlahRequest) {
        this.namaBarang = namaBarang;
        this.jumlahRequest = jumlahRequest;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahRequest() {
        return jumlahRequest;
    }

    public void setJumlahRequest(int jumlahRequest) {
        this.jumlahRequest = jumlahRequest;
    }
}
