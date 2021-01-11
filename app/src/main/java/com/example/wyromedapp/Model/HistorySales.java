package com.example.wyromedapp.Model;

public class HistorySales {
    private String noSales;
    private String historySalesDate;

    public HistorySales(String noSales, String historySalesDate) {
        this.noSales = noSales;
        this.historySalesDate = historySalesDate;
    }

    public String getNoSales() {
        return noSales;
    }

    public void setNoSales(String noSales) {
        this.noSales = noSales;
    }

    public String getHistorySalesDate() {
        return historySalesDate;
    }

    public void setHistorySalesDate(String historySalesDate) {
        this.historySalesDate = historySalesDate;
    }
}
