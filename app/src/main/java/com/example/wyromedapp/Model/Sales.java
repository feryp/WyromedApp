package com.example.wyromedapp.Model;

public class Sales {
    private String noOrder;
    private String salesDate;
    private String status;

    public Sales(String noOrder, String salesDate, String status) {
        this.noOrder = noOrder;
        this.salesDate = salesDate;
        this.status = status;
    }

    public String getNoOrder() {
        return noOrder;
    }

    public void setNoOrder(String noOrder) {
        this.noOrder = noOrder;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
