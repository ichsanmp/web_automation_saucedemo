package com.SauceDemo.page;

import org.openqa.selenium.By;

import static com.SauceDemo.helper.utility.driver;

public class homePage {

    By cart_Icon = By.xpath("//a[@class='shopping_cart_link']");
    By prodSelected1 = By.xpath("(//*[text()='Sauce Labs Backpack'])");
    By prodSelected2 = By.xpath("(//*[text()='Sauce Labs Bike Light'])");
    By prodSelected3 = By.xpath("(//*[text()='Sauce Labs Bolt T-Shirt'])");
    By prodSelected4 = By.xpath("(//*[text()='Sauce Labs Fleece Jacket'])");
    By prodSelected5 = By.xpath("(//*[text()='Sauce Labs Onesie'])");
    By prodSelected6 = By.xpath("(//*[text()='Test.allTheThings() T-Shirt (Red)'])");

    public void validHomePage() {
        driver.findElement(cart_Icon).isDisplayed();
    }

    public void clickProduct(String product) {
        switch (product) {
            case "Sauce Labs Backpack":
                driver.findElement(prodSelected1).click();
                break;
            case "Sauce Labs Bike Light":
                driver.findElement(prodSelected2).click();
                break;
            case "Sauce Labs Bolt T-Shirt":
                driver.findElement(prodSelected3).click();
                break;
            case "Sauce Labs Fleece Jacket":
                driver.findElement(prodSelected4).click();
                break;
            case "Sauce Labs Onesie":
                driver.findElement(prodSelected5).click();
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                driver.findElement(prodSelected6).click();
                break;
        }
    }


}