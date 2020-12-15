package com.example.wyromedapp.Model;

public class DetailTablePesanan {
    String namaBarang;
    int jumlah;

    public DetailTablePesanan(String namaBarang, int jumlah) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }



}
