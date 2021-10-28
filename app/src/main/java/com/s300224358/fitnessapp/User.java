package com.s300224358.fitnessapp;

public class User {
    private int id;
    private String weight;
    private String name;
    private String birthday;
    private String bio;
    public User(){

    }
    public User(int id,String name,String weight,String birthday, String bio){

    }
    public User(int id,String name,String weight,String birthday){

    }

    public User(String name, String weight) {

    }

    public User(String regName, String regWeight, String sqlDob) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
