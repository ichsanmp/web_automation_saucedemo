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
    By actual_Displayed = By.xpath("//*[(@class='inventory_details_name large_size')]");
    By text_prodCompare(String product) {
        return By.xpath("//*[contains(text(),'"+product+"')]");
    }

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

    public void actualDisplayedPage(String product) {
        String actualDisplayed = driver.findElement(actual_Displayed).getText();
        driver.navigate().back();
        String expectedDisplayed = driver.findElement(text_prodCompare(product)).getText();
        System.out.println(
                actualDisplayed.equals(expectedDisplayed) ? "The page is match" : "The page is not match" +
                        "\nDisplayed page : " + actualDisplayed + "\nExpected display page : " + expectedDisplayed
        );
    }
}
