package com.example.wyromedapp.Model;

public class DetailPesananMessage {
    String namaBarang;
    String jumlah;
    String status;

    public DetailPesananMessage(String namaBarang, String jumlah, String status) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.status = status;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
