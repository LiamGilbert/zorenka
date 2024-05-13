package com.example.zorenka.server.model;

public class ChildrenEntity {
    private int id_children;
    private int id_person;
    private int id_group;
    private int id_parent;
    private PersonEntity person;
    private GroupEntity group;

    public int getId_children() {
        return id_children;
    }

    public void setId_children(int id_children) {
        this.id_children = id_children;
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public int getId_parent() {
        return id_parent;
    }

    public void setId_parent(int id_parent) {
        this.id_parent = id_parent;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public GroupEntity getGroup() {
        return group;
    }

    public void setGroup(GroupEntity group) {
        this.group = group;
    }

}
