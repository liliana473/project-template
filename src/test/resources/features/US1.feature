@feyza
Feature: As a user, I should be accessing all the main modules of the app.
  Accounts are : Sales Manager , Store Manager , Drivers
  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US1AC1TC1 Verify that Store and sales managers should view 8 module names.
    Given the user logged in as "store manager"
    Then verify the users see below modules
|Dashboards|
|Fleet|
|Customers|
|Sales|
|Activities|
|Marketing|
|Reports & Segments|
|System|

  Scenario: US1AC1TC1 Verify that Store and sales managers should view 8 module names.
    Given the user logged in as "sales manager"
    Then verify the users see below modules
      |Dashboards|
      |Fleet|
      |Customers|
      |Sales|
      |Activities|
      |Marketing|
      |Reports & Segments|
      |System|


  Scenario: US1AC2TC2 Verify that Store and sales managers should view 8 module names.
    Given the user logged in as "driver"
    Then verify the users see below modules

      | modules    |
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

 # Scenario Outline: US1AC2TC2 Verify that drivers  should view 4 module names.
   # Given the user logged in as "driver"
  #  And the users are on the home page
  #  Then verify the users see  "<modules>" below


  #  Examples:
  #    | modules            |
  #    | Fleet              |
  #    | Customers          |
     # | Activities         |
  #    | System             |