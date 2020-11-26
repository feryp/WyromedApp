package com.example.wyromedapp.Model;

public class Stock {
    private String namaBarang;
    private int jumlahInventoryStock;
    private String satuan;
    private int kuantitasStock;

    public Stock(String namaBarang, int jumlahInventoryStock, String satuan, int kuantitasStock) {
        this.namaBarang = namaBarang;
        this.jumlahInventoryStock = jumlahInventoryStock;
        this.satuan = satuan;
        this.kuantitasStock = kuantitasStock;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlahInventoryStock() {
        return jumlahInventoryStock;
    }

    public void setJumlahInventoryStock(int jumlahInventoryStock) {
        this.jumlahInventoryStock = jumlahInventoryStock;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getKuantitasStock() {
        return kuantitasStock;
    }

    public void setKuantitasStock(int kuantitasStock) {
        this.kuantitasStock = kuantitasStock;
    }
}
