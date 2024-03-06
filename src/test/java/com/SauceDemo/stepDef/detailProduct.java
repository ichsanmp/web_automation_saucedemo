package com.SauceDemo.stepDef;

import com.SauceDemo.page.detailProductPage;
import com.SauceDemo.page.homePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class detailProduct {

    detailProductPage detailProductP;
    homePage homeP;

    public detailProduct() {
        this.detailProductP = new detailProductPage();
        this.homeP = new homePage();
    }

    @And("user is on homepage")
    public void userIsOnHomepage() {
        homeP.validHomePage();
    }

    @When("user click product {string}")
    public void userClickProduct(String product) {
        homeP.clickProduct(product);
    }

    @And("user is on product {string} page")
    public void userIsOnDetailProductPage(String titleProd) {
        detailProductP.validateDetailProd(titleProd);
    }

    @Then("product detail page displayed does not display {string} page")
    public void productDetailPageDisplayedDoesNotDisplayPage(String product) {
        detailProductP.actualDisplayedPage(product);
    }
}
