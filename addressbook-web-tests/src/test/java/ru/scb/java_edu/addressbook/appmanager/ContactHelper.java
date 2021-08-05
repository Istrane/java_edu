package ru.scb.java_edu.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ru.scb.java_edu.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void submitContactModification() {click(By.name("update"));}

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getnickName());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHomePhone());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("work"), contactData.getWorkPhone());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
        type(By.name("homepage"), contactData.getHomePage());
        type(By.name("byear"), contactData.getBirthYear());
        type(By.name("ayear"), contactData.getAYear());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedContact() { click(By.xpath(("//input[@value='Delete']")));}

    public void initBirthDay(String day, String month) {
        click(By.name("bday"));
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText(day);
        click(By.name("bmonth"));
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(month);}

    public void initADay(String day, String month) {
        click(By.name("aday"));
        new Select(driver.findElement(By.name("aday"))).selectByVisibleText(day);
        click(By.name("amonth"));
        new Select(driver.findElement(By.name("amonth"))).selectByVisibleText(month);}

    public void selectGroup(String group) {
        click(By.name("new_group"));
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(group);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']")); }

    public void AcceptAllert() {
        driver.switchTo().alert().accept();
    }

}