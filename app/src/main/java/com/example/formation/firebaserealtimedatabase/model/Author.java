package com.example.formation.firebaserealtimedatabase.model;

/**
 * Created by Formation on 19/01/2018.
 */

public class Author {
    private String name;
    private String firstnName;
    private String nationality;

    public Author() {
    }

    public Author(String name, String firstnName, String nationality) {
        this.name = name;
        this.firstnName = firstnName;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstnName() {
        return firstnName;
    }

    public Author setFirstnName(String firstnName) {
        this.firstnName = firstnName;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Author setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
}
