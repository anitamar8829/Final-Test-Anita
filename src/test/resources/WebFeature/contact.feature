@web
@contact
Feature: Contact

  @send-contact-message-without-login
  Scenario: [Positive] Send contact message without login
    Given user on contact page
    And user input email with "random@gmail.com"
    And user input name with "random"
    And user input message with "Just Test Message send-contact-message-without-login"
    When user click send message button
    Then user get message "Thanks for the message!!"

  @send-contact-message-with-login
  Scenario: [Positive] Send contact message with login
    Given user login and on homepage
    And user click link contact
    And user input email with "random@gmail.com"
    And user input name with "random"
    And user input message with "Just Test Message send-contact-message-with-login"
    When user click send message button
    Then user get message "Thanks for the message!!"

  @send-contact-message-with-blank-email
  Scenario: [Negative] Send contact message with blank email
    Given user login and on homepage
    And user click link contact
    And user input email with ""
    And user input name with "random"
    And user input message with "Just Test Message send-contact-message-with-blank-email"
    When user click send message button
    Then user get message "Thanks for the message!!"

  @send-contact-message-with-blank-name
  Scenario: [Negative] Send contact message with blank name
    Given user login and on homepage
    And user click link contact
    And user input email with "random@gmail.com"
    And user input name with ""
    And user input message with "Just Test Message send-contact-message-with-blank-name"
    When user click send message button
    Then user get message "Thanks for the message!!"

  @send-contact-message-with-blank-name-email
  Scenario: [Negative] Send contact message with blank name and email
    Given user login and on homepage
    And user click link contact
    And user input email with ""
    And user input name with ""
    And user input message with "Just Test Message ssend-contact-message-with-blank-name-email"
    When user click send message button
    Then user get message "Thanks for the message!!"

  @cancel-send-contact-message
  Scenario: [Positive] Cancel send contact message
    Given user login and on homepage
    And user click link contact
    And user input email with "random@gmail.com"
    And user input name with "random"
    And user input message with "Just Test Message cancel-send-contact-message"
    When user click close button contact