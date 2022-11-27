Feature: check googl search functionality

  Scenario: google search validation is working
    Given browser is open
    When user is on the google sesrch page
    And user enters a text in the google search box
    Then user navigated to the search results page
