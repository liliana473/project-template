Feature: View columns on Vehicle model information

  Background: User is already on the login page of the Fleet application
    Given  the user is on the login page

  @B28G30-144
  Scenario Outline: US5AC1TC1 verify that user can access Vehicle Model page
    Given the user logged in as "<user>"
    When the user navigates to "Fleet" - "Vehicles Model"
    Then the user should see below options

      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |
    Examples:
      | user          |
      | sales manager |
      | store manager |


  Scenario: US5AC2TC1 verify that user can not access Vehicle Model page
    Given the user logged in as "driver"
    And  the user navigates to "Fleet" - "Vehicles Model"
    Then users see an error message as: "You do not have permission to perform this action."









