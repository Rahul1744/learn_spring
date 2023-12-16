package org.example.prgm11;

public class Author {
    private int id;
    private String name;
    private String dob;

    public Author(int id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void displayBasicInfo() {
        System.out.println("Author name is " + name
                + " and Id is " + id + "DoB" + dob);
    }

    // Getters & Setters
}