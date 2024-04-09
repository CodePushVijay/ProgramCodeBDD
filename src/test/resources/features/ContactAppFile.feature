@ContactApp
Feature: Login the Contact Application

  Scenario: To verify the login success
    Given The launch browser for contact Application
   When Enter the username and password
    When User clicks on login button
    Then validates Contact Home page should be displayed
    And Get the title of Contact Application
    And To click the Add contact button
    And Add the contact details for the users
    When I click the Submit button
    Then Contact Details should be displayed
    And Users logout the Contact Application
