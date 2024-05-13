package com.example.zorenka.server.model;

import java.util.Date;

public class MedcomissionEntity {
    private int id_medcomission;
    private int id_medstatus;
    private String date;
    private MedstatusEntity medstatus;

    public int getId_medcomission() {
        return id_medcomission;
    }

    public void setId_medcomission(int id_medcomission) {
        this.id_medcomission = id_medcomission;
    }

    public int getId_medstatus() {
        return id_medstatus;
    }

    public void setId_medstatus(int id_medstatus) {
        this.id_medstatus = id_medstatus;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public MedstatusEntity getMedstatus() {
        return medstatus;
    }

    public void setMedstatus(MedstatusEntity medstatus) {
        this.medstatus = medstatus;
    }
}
