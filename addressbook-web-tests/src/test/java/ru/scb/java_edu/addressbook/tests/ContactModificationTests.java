package ru.scb.java_edu.addressbook.tests;

import org.testng.annotations.Test;
import ru.scb.java_edu.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testUpdateContact() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("rodman", "olegovich", "ch",
                "rch", "admin", "scb", "1223",
                "555555", "88005553535", "89238983292", "9842192422",
                "a@a.ru", "b@b.ru", "c@c.ru", "test.ru", "1992", "1990",
                "dasd", "220011", "dksal"));
        app.getContactHelper().initBirthDay("22", "October");
        app.getContactHelper().initADay("11", "June");
        app.getContactHelper().submitContactModification();
    }
}
