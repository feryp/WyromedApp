package com.example.wyromedapp.Model;

public class OrderPurchasedItem {
    private String namaBarang;
    private int jumlahKuantitas;

    public OrderPurchasedItem(String namaBarang, int jumlahKuantitas) {
        this.namaBarang = namaBarang;
        this.jumlahKuantitas = jumlahKuantitas;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahKuantitas() {
        return jumlahKuantitas;
    }

    public void setJumlahKuantitas(int jumlahKuantitas) {
        this.jumlahKuantitas = jumlahKuantitas;
    }
}
