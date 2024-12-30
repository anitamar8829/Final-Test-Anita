@web
@logout
Feature: Logout

  @user-logout
  Scenario: [Positive] User logout
    Given open web demoblaze login
    And user input username with "ceria01"
    And user input password with "ceria"
    When user click login button
    Then user is on homepage
    And user click logout button