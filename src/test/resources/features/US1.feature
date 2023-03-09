
Feature: As a user, I should be accessing all the main modules of the app.
  Accounts are : Sales Manager , Store Manager , Drivers

  Background: User is already in the log in page
    Given the user is on the login page

@B28G30-152
  Scenario Outline: US1AC1TC1 Verify that Store and sales managers should view 8 module names.
    Given the user logged in as "<userType>"
    Then verify the users see below modules
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Examples:
    | userType             |
    | sales manager             |
    | store manager             |


@B28G30-153
  Scenario: US1AC2TC2 Verify that Drivers should view 4 module names
    Given the user logged in as "driver"
    Then verify the users see below modules


      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

