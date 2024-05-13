package com.example.zorenka.server.model;

import java.util.Date;

public class AttendanceEntity {
    private int id_attendance;
    private int id_child;
    private String date;
    private String mark;
    private Integer id_reason;
    private ChildrenEntity children;
    private ReasonEntity reason;

    public int getId_attendance() {
        return id_attendance;
    }

    public void setId_attendance(int id_attendance) {
        this.id_attendance = id_attendance;
    }

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

    public ChildrenEntity getChildren() {
        return children;
    }

    public void setChildren(ChildrenEntity children) {
        this.children = children;
    }

    public ReasonEntity getReason() {
        return reason;
    }

    public void setReason(ReasonEntity reason) {
        this.reason = reason;
    }
}
