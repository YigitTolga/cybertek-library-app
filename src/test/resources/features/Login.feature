@all
Feature: Login Functionality
  User Story: User should able to login with valid credential


  Scenario: login as a librarian
    Given User on the login page
    When User enter librarian valid username and password
    And user click login button
    Then user should land dashboard


  Scenario: login as a student
    Given User on the login page
    When User enter student valid username and password
    And user click login button
    Then user should land dashboard

