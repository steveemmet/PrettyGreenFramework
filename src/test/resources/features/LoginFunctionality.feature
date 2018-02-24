Feature: Pretty Green Login Functionality

  //Background:
   // Given Not a validated user
   // When User browse to website
   // Then Homepage should display
    //When User click login link
   // Then Browser display Login page



  Scenario: 1. Valid user with valid password
    Given Not a validated user
    When User browse to website
    Then Pretty Green Homepage should display
    When User click login link
    Then Browser display Login page
    When User enter user email as "steveemmet@yahoo.com"
    And User enter password as "Pickles123"
    And User click login button
    Then Homepage should display
    And Logout button should be present


