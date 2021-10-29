package com.s300224358.fitnessapp;

public class User {
    private int id;
    private String weight;
    private String username;
    private String name;
    private String birthday;
    private String bio;
    public User(){

    }
    public User(int id,String username,String name,String weight,String birthday, String bio){
        this.id = id;
        this.username = username;
        this.name = name;
        this.birthday=birthday;
        this.bio=bio;

    }


    public User(String userID,String regName, String regWeight, String sqlDob) {
        this.name = regName;
        this.weight = regWeight;
        this.birthday = sqlDob;
        this.username = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
