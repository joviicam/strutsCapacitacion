package com.example.demo.person.bean;

public class BeanUsuario {
    long idUser;
    String username;
    boolean status;
    long idPerson;
    BeanPersona person;

    public BeanUsuario(long idUser, String username, boolean status, long idPerson, BeanPersona person) {

    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    public BeanPersona getPerson() {
        return person;
    }

    public void setPerson(BeanPersona person) {
        this.person = person;
    }
}
