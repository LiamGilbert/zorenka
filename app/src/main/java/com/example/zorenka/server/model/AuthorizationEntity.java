package com.example.zorenka.server.model;

public class AuthorizationEntity {
    private Integer id_autorization;
    private Integer id_person;
    private String login;
    private PersonEntity person;

    public Integer getId_autorization() {
        return id_autorization;
    }

    public void setId_autorization(Integer id_autorization) {
        this.id_autorization = id_autorization;
    }

    public Integer getId_person() {
        return id_person;
    }

    public void setId_person(Integer id_person) {
        this.id_person = id_person;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }
}
