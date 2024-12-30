@web
@cart
Feature: Add To Cart

  @add-product-to-cart
  Scenario: [Positive] User added product to cart with login
    Given user on detail product page "Iphone 6 32gb"
    When user click add to cart
    Then product "Iphone 6 32gb" add to cart

  @delete-product-from-cart-list
  Scenario: [Positive] Delete product from cart list
    Given user on detail product page "MacBook air"
    And user click add to cart
    And product "MacBook air" add to cart
    When user click delete button
    Then product deleted from cart list