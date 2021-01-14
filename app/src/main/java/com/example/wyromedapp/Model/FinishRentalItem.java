package com.example.wyromedapp.Model;

public class FinishRentalItem {
    private String namaBarang;
    private String statusOperation;
    private String totalTimer;

    public FinishRentalItem(String namaBarang, String statusOperation, String totalTimer) {
        this.namaBarang = namaBarang;
        this.statusOperation = statusOperation;
        this.totalTimer = totalTimer;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getStatusOperation() {
        return statusOperation;
    }

    public void setStatusOperation(String statusOperation) {
        this.statusOperation = statusOperation;
    }

    public String getTotalTimer() {
        return totalTimer;
    }

    public void setTotalTimer(String totalTimer) {
        this.totalTimer = totalTimer;
    }
}
