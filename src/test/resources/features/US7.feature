Feature: As a user, I should be able to select any vehicle from the Vehicle page

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: US7AC1TC1
    Given the user logged in as "store manager"
    When the user hover over Fleet
    And the user clicks on Vehicle
    Then the user launches on the Vehicle page
    And the user should see all checkboxes are unchecked