Feature: add product to cart on product detail page at saucedemo.com

  @using-standard_user-for-login
  Scenario: add product to cart with specific product
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    And user is on homepage
    When user click product "Sauce Labs Onesie"
    And user is on product "Sauce Labs Onesie" page
    When user click add to cart button on detail product page
    Then user can see the cart logo is match "1"

  @using-locked_out_user-for-login
  Scenario: add product to cart with specific product
    Given user is on login page
    And user input username with "locked_out_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user can see error message "user has been locked out."

  @using-problem_user-for-login
  Scenario: add product to cart with specific product
    Given user is on login page
    And user input username with "problem_user"
    And user input password with "secret_sauce"
    When user click login button
    And user is on homepage
    When user click product "Sauce Labs Onesie"
    Then product detail page displayed does not display "Sauce Labs Onesie" page