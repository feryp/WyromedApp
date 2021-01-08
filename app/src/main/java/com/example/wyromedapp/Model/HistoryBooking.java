package com.example.wyromedapp.Model;

public class HistoryBooking {
    private String noOrder;
    private String historyBookingDate;

    public HistoryBooking(String noOrder, String historyBookingDate) {
        this.noOrder = noOrder;
        this.historyBookingDate = historyBookingDate;
    }

    public String getNoOrder() {
        return noOrder;
    }

    public void setNoOrder(String noOrder) {
        this.noOrder = noOrder;
    }

    public String getHistoryBookingDate() {
        return historyBookingDate;
    }

    public void setHistoryBookingDate(String historyBookingDate) {
        this.historyBookingDate = historyBookingDate;
    }
}
