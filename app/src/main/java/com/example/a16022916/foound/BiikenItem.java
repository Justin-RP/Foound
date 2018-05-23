package com.example.a16022916.foound;

public class BiikenItem {

    private String label;
    private String date;
    private String desc;
    private STATUS status;

    public BiikenItem(String label, String date, String desc, STATUS status) {
        this.label = label;
        this.date = date;
        this.desc = desc;
        this.status = status;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }
}
