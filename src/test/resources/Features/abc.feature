

@SmokeFeature
Feature: features to test lgoin functionality
@smoketest
  Scenario: login check is successful valid credential
    Given user is on the login page
    When user enters username and password
    And clicks on the login button
    Then user is navigating to the homepage.
