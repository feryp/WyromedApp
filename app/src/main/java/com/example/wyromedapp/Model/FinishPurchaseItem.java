package com.example.wyromedapp.Model;

public class FinishPurchaseItem {
    private String namaBarang;
    private int jumlahBarang;

    public FinishPurchaseItem(String namaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
}
