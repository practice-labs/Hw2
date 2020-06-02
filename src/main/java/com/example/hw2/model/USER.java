package com.example.hw2.model;

public class USER {

        private int age;
        private String name;
        private String address;
        private String profilePicUrl;

    public USER(int age, String name, String address, String profilePicUrl) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.profilePicUrl = profilePicUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }
}
//name:String
//        address:String
//        age:int
//        profilePicUrl:String
