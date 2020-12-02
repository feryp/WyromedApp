package com.example.wyromedapp.Model;

public class DetailSalesRentItem {
    private String namaBarang;
    private String hargaBarang;
    private int kuantitasBarang;
    private String totalHarga;

    public DetailSalesRentItem(String namaBarang, String hargaBarang, int kuantitasBarang, String totalHarga) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.kuantitasBarang = kuantitasBarang;
        this.totalHarga = totalHarga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getKuantitasBarang() {
        return kuantitasBarang;
    }

    public void setKuantitasBarang(int kuantitasBarang) {
        this.kuantitasBarang = kuantitasBarang;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }
}
