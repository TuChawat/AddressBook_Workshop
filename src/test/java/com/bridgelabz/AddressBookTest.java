package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

public class AddressBookTest {
    AddressBook addressBook = new AddressBook();

    @Test
    public void givenDataWhenAdded_ShouldReturn_True() throws ClassNotFoundException, SQLException {
        ContactPerson contactPerson = new ContactPerson("Tushar",
                "Chawat",
                "Sewagram",
                "Wardha",
                "Maharashtra",442001,"8888089564");
        boolean isAdd = AddressBook.addPerson(contactPerson);
        Assertions.assertTrue(isAdd);
    }
}
