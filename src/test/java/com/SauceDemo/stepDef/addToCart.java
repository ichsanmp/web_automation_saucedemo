package com.SauceDemo.stepDef;

import com.SauceDemo.page.detailProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addToCart {

    detailProductPage detailProductP;

    public addToCart() {
        this.detailProductP = new detailProductPage();
    }

    @When("user click add to cart button on detail product page")
    public void userClickAddToCartButtonOnDetailProductPage() {
        detailProductP.clickAddToCartDetailProd();
    }

    @Then("user can see the cart logo is match {string}")
    public void userCanSeeTheCartLogoIsMatch(String sumCartItem) {
        detailProductP.validateSumCartItem(sumCartItem);
    }
}
