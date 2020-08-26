package com.example.wyromedapp.Model;

import java.util.Date;

public class CarouselModel {

    private int illustration;
    private String date;
    private String title;
    private String total;

    public CarouselModel(int illustration, String date, String title, String total) {
        this.illustration = illustration;
        this.date = date;
        this.title = title;
        this.total = total;
    }

    public int getIllustration() {
        return illustration;
    }

    public void setIllustration(int illustration) {
        this.illustration = illustration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }


}
