package com.tp3.PersonneApi.model;

public class Personne {

    private int id;
    private String nom;
    private int age;
    private String nationality;

    public Personne(int id, String nom, int age, String nationality) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
