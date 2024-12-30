@web
@checkout
Feature: Place Order

  @user-checkout-product-in-cart
  Scenario: [Positive] user checkout product in cart
    Given user in cart page
    And user input name "Dino"
    And user input country with "Indonesia"
    And user input city with "Jakarta"
    And user input credit card with "1234567890"
    And user input month with "March"
    And user input year with "2030"
    When user click purchase button
    Then purchase processed

  @user-checkout-product-only-with-name-and-credit-card
  Scenario: [Positive] user checkout product in cart only with name and credit card
    Given user in cart page
    And user input name "Dino"
    And user input country with ""
    And user input city with ""
    And user input credit card with "1234567890"
    And user input month with ""
    And user input year with ""
    When user click purchase button
    Then purchase processed

  @user-cancel-checkout
  Scenario: [Positive] User cancel checkout
    Given user in cart page
    And user input name "Cancel Checkout"
    And user input country with "Indonesia"
    And user input city with "Jakarta"
    And user input credit card with "1234567890"
    And user input month with "March"
    And user input year with "2030"
    When user click close button button
    Then user back in cart page

  @user-checkout-product-with-blank-name
  Scenario: [Negative] user checkout product with blank name
    Given user in cart page
    And user input name ""
    And user input country with "Indonesia"
    And user input city with "Jakarta"
    And user input credit card with "1234567890"
    And user input month with "March"
    And user input year with "2030"
    When user click purchase button
    Then user get message alert "Please fill out Name and Creditcard."

  @user-checkout-product-with-blank-credit-card
  Scenario: [Negative] user checkout product with credit card
    Given user in cart page
    And user input name "Blank creditcard"
    And user input country with "Indonesia"
    And user input city with "Jakarta"
    And user input credit card with ""
    And user input month with "March"
    And user input year with "2030"
    When user click purchase button
    Then user get message alert "Please fill out Name and Creditcard."