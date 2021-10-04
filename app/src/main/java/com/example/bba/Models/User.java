package com.example.bba.Models;

public class User {
    String name , bloodgroup , id, email, phonenumber, profilepictureur1, search,type;

    public User() {
    }

    public User(String name, String bloodgroup, String id, String email, String phonenumber, String profilepictureur1, String search, String type) {
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.id = id;
        this.email = email;
        this.phonenumber = phonenumber;
        this.profilepictureur1 = profilepictureur1;
        this.search = search;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getProfilepictureur1() {
        return profilepictureur1;
    }

    public void setProfilepictureur1(String profilepictureur1) {
        this.profilepictureur1 = profilepictureur1;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
