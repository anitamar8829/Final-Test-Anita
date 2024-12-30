@web
@categories
Feature: Product Categories

  @phones-categories
  Scenario: [Positive] Display product by phones categories
    Given user login and on homepage
    When user click link phone categories
    Then categories by phones displayed

  @laptops-categories
  Scenario: [Positive] Display product by laptops categories
    Given user login and on homepage
    When user click link laptop categories
    Then categories by laptop displayed

  @monitors-categories
  Scenario: [Positive] Display product by monitors categories
    Given user login and on homepage
    When user click link monitors categories
    Then categories by monitors displayed