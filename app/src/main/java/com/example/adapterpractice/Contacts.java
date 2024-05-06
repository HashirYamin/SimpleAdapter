package com.example.adapterpractice;
public class Contacts {
    private final String name;
    private final String phoneNumber;
    private final int imageResourceId;
    public Contacts(String name, String phoneNumber, int imageResourceId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
