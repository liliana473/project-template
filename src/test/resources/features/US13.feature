Feature:user able to manage filters on the Vehicle Costs page. (Web table and checkbox)
  Accounts are : Sales Manager , Store Manager , Drivers

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: US13AC1TC1 Verify user able to see 3 columns on the Vehicle Cost page.
    Given the user logged in as "sales manager"
    When the user navigates to "Fleet" - "Vehicle Costs"
    Then the user should see expected "<columns>" as below
    Examples:
      | columns     |
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |


    Scenario: US13AC2TC1 users check the first checkbox to select all the Vehicle Cost
      Given the user logged in as "sales manager"
      When the user navigates to "Fleet" - "Vehicle Costs"
      And the user clicks the first checkbox
      Then the user verifies all checkboxes are checked







