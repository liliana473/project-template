Feature: As a user, I should be able to select any vehicle from the Vehicle page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US7AC1TC1 users view unchecked checkboxes on the Vehicle page
    Given the user logged in as "store manager"
    When the user navigates to "Fleet" - "Vehicles"
    Then the user should see all checkboxes are unchecked

  @wip
    Scenario: US7AC2TC2 users check the first checkbox to check all the cars
    Given the user logged in as "store manager"
    When the user navigates to "Fleet" - "Vehicles"
    And the user clicks the first checkbox in the web-table
    Then the user verifies all checkboxes are checked

    Scenario: US7AC3TC3 user checks any car's checkbox
      Given the user logged in as "store manager"
      When the user navigates to "Fleet" - "Vehicles"
      And the user clicks any car's checkbox
      Then the user verifies the box is checked