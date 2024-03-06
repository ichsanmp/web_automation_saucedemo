package com.SauceDemo.page;

import org.openqa.selenium.By;

import static com.SauceDemo.helper.utility.driver;

public class homePage {

    By cart_Icon = By.xpath("//a[@class='shopping_cart_link']");
    By text_prodSelect(String product) {
        return By.xpath("//*[contains(text(),'"+product+"')]");
    }

    public void validHomePage() {
        driver.findElement(cart_Icon).isDisplayed();
    }

    public void clickProduct(String product) {
        driver.findElement(text_prodSelect(product)).click();
    }


}