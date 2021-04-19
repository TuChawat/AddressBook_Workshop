package com.bridgelabz;

public class ContactPerson {
    public String firstName;
    private String lastName;
    private String address;
    public String city;
    public String state;
    private String phoneNumber;
    private long zip;

    public ContactPerson(String firstName, String lastName, String address, String city, String state, long zip, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.zip = zip;
    }
    @Override
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phone=" + phoneNumber +
                ", zip=" + zip +
                '}';
    }
}
