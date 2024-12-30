@web
@login
Feature: WEB Testing

  @open-web-login
  Scenario: [Positive] Open web page and login
    Given open web demoblaze login
    And user input username with "ceria01"
    And user input password with "ceria"
    When user click login button
    Then user is on homepage

  @login-invalid-username
  Scenario: [Negative] Login using invalid username
    Given open web demoblaze login
    And user input username with "ergaeaeryaraer"
    And user input password with "ceria"
    When user click login button
    Then user get error message "User does not exist."

  @login-invalid-password
  Scenario: [Negative] Login using invalid password
    Given open web demoblaze login
    And user input username with "ceria01"
    And user input password with "invalid"
    When user click login button
    Then user get error message "Wrong password."

  @login-blank-username
  Scenario: [Negative] Login using blank username
    Given open web demoblaze login
    And user input username with ""
    And user input password with "ceria"
    When user click login button
    Then user get error message "Please fill out Username and Password."

  @login-blank-password
  Scenario: [Negative] Login using blank password
    Given open web demoblaze login
    And user input username with "ceria01"
    And user input password with ""
    When user click login button
    Then user get error message "Please fill out Username and Password."

  @login-blank-username-password
  Scenario: [Negative] Login using blank username and password
    Given open web demoblaze login
    And user input username with ""
    And user input password with ""
    When user click login button
    Then user get error message "Please fill out Username and Password."

  @cancel-login-close
  Scenario: [Negative] cancel login and close
    Given open web demoblaze login
    And user input username with "ceria01"
    And user input password with "ceria"
    When user click close button
    Then user is on homepage