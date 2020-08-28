package com.example.wyromedapp.Model;

public class ListMessage {

    private String titleMessage;
    private String detailMessage;
    private String timeMessage;

    public ListMessage(String titleMessage, String detailMessage, String timeMessage) {
        this.titleMessage = titleMessage;
        this.detailMessage = detailMessage;
        this.timeMessage = timeMessage;
    }

    public String getTitleMessage() {
        return titleMessage;
    }

    public void setTitleMessage(String titleMessage) {
        this.titleMessage = titleMessage;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    public String getTimeMessage() {
        return timeMessage;
    }

    public void setTimeMessage(String timeMessage) {
        this.timeMessage = timeMessage;
    }


}
