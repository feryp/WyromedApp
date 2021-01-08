package com.example.wyromedapp.Model;

public class MyBooking {
    private String noOrder;
    private String bookingDate;
    private String status;

    public MyBooking(String noOrder, String bookingDate, String status) {
        this.noOrder = noOrder;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    public String getNoOrder() {
        return noOrder;
    }

    public void setNoOrder(String noOrder) {
        this.noOrder = noOrder;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
