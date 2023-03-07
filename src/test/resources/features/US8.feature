
Feature: User want to create a recurring(repetitive) calendar event.
  Accounts are: SalesManager,StoreManager,Driver

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: US8AC1TC1 Verify that user can create a recurring(repetitive) calendar event.
    Given the user logged in as <userType>
    And the users are on the homepage
    Then  click the “Calendar Events” under the Activities
    And  click the “Create Calendar Event” button
    Then check the Repeat checkbox
    And  Verify the repeat number is "1"

    Examples:
      | userType        |
      | "sales manager" |
      | "store manager" |
      | "driver         |

