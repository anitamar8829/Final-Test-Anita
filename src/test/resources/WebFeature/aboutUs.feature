@web
@aboutus
Feature: About Us

  @about-us-without-login
  Scenario: [Positive] About Us page and play video without login
    Given user is on about us page
    When user click play button
    Then close after video played

  @about-us-with-login
  Scenario: [Positive] About Us page and play video with login
    Given user login and on homepage
    And user click link about us
    When user click play button
    Then close after video played