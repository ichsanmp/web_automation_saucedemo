package com.SauceDemo.stepDef;

import com.SauceDemo.page.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

    loginPage loginP;

    public login() {
        this.loginP = new loginPage();
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginP.getLoginPage();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginP.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginP.inputPassword(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginP.clickLoginButton();
    }

    @Then("user can see error message {string}")
    public void userCanSeeErrorMessage(String errMsg) {
        loginP.assertErrMsg(errMsg);
    }
}
