package ru.scb.java_edu.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);;
    }

}
