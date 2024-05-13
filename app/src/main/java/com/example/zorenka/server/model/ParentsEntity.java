package com.example.zorenka.server.model;

public class ParentsEntity {
    private int id_parent;
    private int id_mother;
    private int id_father;

    private PersonEntity mother;
    private PersonEntity father;

    public int getId_parent() {
        return id_parent;
    }

    public void setId_parent(int id_parent) {
        this.id_parent = id_parent;
    }

    public int getId_mother() {
        return id_mother;
    }

    public void setId_mother(int id_mother) {
        this.id_mother = id_mother;
    }

    public int getId_father() {
        return id_father;
    }

    public void setId_father(int id_father) {
        this.id_father = id_father;
    }

    public PersonEntity getMother() {
        return mother;
    }

    public void setMother(PersonEntity mother) {
        this.mother = mother;
    }

    public PersonEntity getFather() {
        return father;
    }

    public void setFather(PersonEntity father) {
        this.father = father;
    }
}
