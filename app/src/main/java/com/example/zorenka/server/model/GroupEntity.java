package com.example.zorenka.server.model;

public class GroupEntity {
    private int id_group;
    private String group_name;
    private int id_educator;
    private int id_grouptype;
    private PersonEntity person;
    private GroupTypeEntity type;

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public int getId_educator() {
        return id_educator;
    }

    public void setId_educator(int id_educator) {
        this.id_educator = id_educator;
    }

    public int getId_grouptype() {
        return id_grouptype;
    }

    public void setId_grouptype(int id_grouptype) {
        this.id_grouptype = id_grouptype;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public GroupTypeEntity getType() {
        return type;
    }

    public void setType(GroupTypeEntity type) {
        this.type = type;
    }
}
