Feature:user able to manage filters on the Vehicle Costs page. (Web table and checkbox)
  Accounts are : Sales Manager , Store Manager , Drivers

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: US13AC1TC1 Verify user able to see 3 colums on the Vehicle Cost page.
    Given the user logged in as "<UserType>"
    When the user navigates to "Fleet" - "Vehicle Costs"
    Then the user should see "<columns>" as below

    Examples:
      | UserType      |
      | store manager |
      | sales manager |
      | driver        |

    Examples:
      | columns     |
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |





