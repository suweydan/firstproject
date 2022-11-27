
@RegressionTest
Feature: Title of your feature
  I want to validate login
@RegressionTest
  Scenario: successful loginwith valid credentials
    Given user launch chrome browser
    When user opens url "https:/www.facebook.com"
    And user enters email as "khalif92@hotmail.com" and password as "Abdullahi@123"
    And user click on login
    Then page tiltle should be "facebook - log in or sign up"
    And close browser

  Scenario Outline:successful loginwith valid credentials
    Given user launch chrome browser
    When user opens url "https:/www.facebook.com"
    And user enters email as "<email>" and password as "<password>"
    And user click on login
    Then page tiltle should be "facebook - log in or sign up"
    And close browser
  
  Examples:
  |email|password|
  |khalif92@hotmail.com|issack!trt77|
  |abdiali@yahoo.com|ali123!abc|
  