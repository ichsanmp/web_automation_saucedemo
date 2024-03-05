package com.SauceDemo.page;

import org.openqa.selenium.By;

import static com.SauceDemo.helper.utility.driver;

public class loginPage {

    By usernameInputText = By.id("user-name");
    By passwordInputText = By.id("password");
    By loginButton = By.id("login-button");
    By textErrMsg(String errMsg) {
        return By.xpath("//*[contains(text(), '"+errMsg+"')]");
    }

    public void getLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void assertErrMsg(String errMsg) {
        driver.findElement(textErrMsg(errMsg)).isDisplayed();
    }

}
