package com.SauceDemo.page;

import org.openqa.selenium.By;

import static com.SauceDemo.helper.utility.driver;
import static org.junit.Assert.assertEquals;

public class detailProductPage {

    By text_TitleProd(String titleProd) {
        return By.xpath("//*[contains(text(),'"+titleProd+"')]");
    }
    By button_nameProd = By.xpath("(//button[normalize-space()='Add to cart'])[1]");
    By qtyCartItem = By.xpath("//span[@class='shopping_cart_badge']");
    public void validateDetailProd(String titleProd) {
        driver.findElement(text_TitleProd(titleProd)).isDisplayed();
    }

    public void clickAddToCartDetailProd() {
        driver.findElement(button_nameProd).click();
    }

    public void validateSumCartItem(String sumCartItem) {
        String qtyActual = driver.findElement(qtyCartItem).getText();
        assertEquals(sumCartItem,qtyActual);
    }
}
