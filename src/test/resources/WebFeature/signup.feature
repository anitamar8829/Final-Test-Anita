@web
@signup
Feature: Signup

  @signup-new-user
  Scenario: [Postive] signup create new user
    Given open web demoblaze signup
    And user input new username with "RandomName51"
    And user input new password with "randompass"
    And user click signup button
    Then user get confirmation message "Sign up successful."

  @signup-existing-username
  Scenario: [Negative] signup with existing username
    Given open web demoblaze signup
    And user input new username with "ceria01"
    And user input new password with "ceria"
    And user click signup button
    Then user get confirmation message "This user already exist."

  @signup-blank-username
  Scenario: [Negative] signup with blank username
    Given open web demoblaze signup
    And user input new username with ""
    And user input new password with "blankpass"
    And user click signup button
    Then user get confirmation message "Please fill out Username and Password."

  @signup-blank-password
  Scenario: [Negative] signup with blank password
    Given open web demoblaze signup
    And user input new username with "blankpassword"
    And user input new password with ""
    And user click signup button
    Then user get confirmation message "Please fill out Username and Password."

  @signup-blank-username-password
  Scenario: [Negative] signup with blank username and password
    Given open web demoblaze signup
    And user input new username with ""
    And user input new password with ""
    And user click signup button
    Then user get confirmation message "Please fill out Username and Password."

  @cancel-signup
  Scenario: [Postive] cancel signup
    Given open web demoblaze signup
    And user input new username with "RandomName02"
    And user input new password with "randompass"
    When user cancel and click close button
    Then user is on firstpage