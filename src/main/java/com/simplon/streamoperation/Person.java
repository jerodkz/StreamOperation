package com.simplon.streamoperation;

//package stream.model;

public class Person {

    private String name;
    private String surname;
    private int age;
    private String language;
    private boolean married;

    public Person(){
    }

    public Person(String name, String surname, int age, String language, boolean married) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.language = language;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "{\"name\":\"" + name +
                "\",\"surname\":\"" + surname +
                "\",\"age\":" + age +
                ",\"language\":\"" + language +
                "\",\"married\":" + married + "}";
    }

}