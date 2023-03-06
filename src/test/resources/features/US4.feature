Feature: User able to access to Vehicle contracts page

  Accounts are : Sales Manager , Store Manager , Drivers

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: US4AC1TC1 Verify that user can access the Vehicle contracts page
    Given the user logged in as <userType>
    And the user click on the Vehicle contracts under the Fleet
    Then managers can access the Vehicle contracts page

    Examples:
      | userType        |
      | "sales manager" |
      | "store manager" |




  Scenario: US4AC2TC1 Verify Drivers can NOT access the Vehicle contracts page
    Given the user logged in as "driver"
    And the user click on the Vehicle contracts under the Fleet
    Then Verify users see an error message: “You do not have permission to perform this action.”



