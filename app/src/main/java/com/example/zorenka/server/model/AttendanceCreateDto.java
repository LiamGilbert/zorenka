package com.example.zorenka.server.model;

import java.util.Date;

public class AttendanceCreateDto {
    private int id_child;
    private String date;
    private String mark;
    private int id_reason;

    public int getId_child() {
        return id_child;
    }

    public void setId_child(int id_child) {
        this.id_child = id_child;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getId_reason() {
        return id_reason;
    }

    public void setId_reason(int id_reason) {
        this.id_reason = id_reason;
    }
}
