Feature: View columns on Vehicle model information

  Background: User is already on the login page of the Fleet application
    Given  the user is on the login page

  Scenario Outline: US5AC1TC1 verify that user can access Vehicle Model page
    Given the user logged in as "store manager"
    And the user navigate to "Fleet"-"Vehicle models"
    Then the user should see below "<columns>"
    Examples:
      | columns                  |
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

  Scenario Outline: US5AC1TC2 verify that user can access Vehicle Model page
    Given the user logged in as "sales manager"
    And the user navigate to "Fleet"-"Vehicle models"
    Then the user should see below "<columns>"
    Examples:
      | columns                  |
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

  Scenario: US5AC2TC1 verify that user can access Vehicle Model page
    Given the user logged in as "driver"
    And the user should not be able to access Vehicle Model
    Then user should see "You do not have permission to perform this action."







