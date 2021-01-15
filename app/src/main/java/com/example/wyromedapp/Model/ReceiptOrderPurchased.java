package com.example.wyromedapp.Model;

public class ReceiptOrderPurchased {
    private String namaBarang;
    private int jumlahBarangDipakai;

    public ReceiptOrderPurchased(String namaBarang, int jumlahBarangDipakai) {
        this.namaBarang = namaBarang;
        this.jumlahBarangDipakai = jumlahBarangDipakai;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahBarangDipakai() {
        return jumlahBarangDipakai;
    }

    public void setJumlahBarangDipakai(int jumlahBarangDipakai) {
        this.jumlahBarangDipakai = jumlahBarangDipakai;
    }
}
