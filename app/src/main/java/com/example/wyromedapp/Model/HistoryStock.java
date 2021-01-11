package com.example.wyromedapp.Model;

public class HistoryStock {
    private String noRequest;
    private String historyRequestDate;
    private String statusRequest;

    public HistoryStock(String noRequest, String historyRequestDate, String statusRequest) {
        this.noRequest = noRequest;
        this.historyRequestDate = historyRequestDate;
        this.statusRequest = statusRequest;
    }

    public String getNoRequest() {
        return noRequest;
    }

    public void setNoRequest(String noRequest) {
        this.noRequest = noRequest;
    }

    public String getHistoryRequestDate() {
        return historyRequestDate;
    }

    public void setHistoryRequestDate(String historyRequestDate) {
        this.historyRequestDate = historyRequestDate;
    }

    public String getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(String statusRequest) {
        this.statusRequest = statusRequest;
    }
}
