package com.bridgelabz;


import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    public static void main() {
        System.out.println(" Welcome to Address Book Program ");
    }


    public static boolean addPerson(ContactPerson contactPerson) {
        List<ContactPerson> ContactPersonList = new ArrayList<>();
        try {
            ContactPersonList.add(contactPerson);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        }
}