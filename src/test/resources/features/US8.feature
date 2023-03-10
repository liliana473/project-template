
Feature: User want to create a recurring(repetitive) calendar event.
  Accounts are: SalesManager,StoreManager,Driver

  Background: User is already in the log in page
    Given the user is on the login page
@B28G30-151
  Scenario: US8AC1TC1  user should see the number “1” by default in the Repeat Every input.
    Given the user logged in as "store manager"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click the Create Calendar Event button
    Then Check the Repeat checkbox
    And Verify the repeat number is "1"

@B28G30-154
  Scenario: US8AC2TC2 users clear the repeat day and see an error message
    Given the user logged in as "store manager"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click the Create Calendar Event button
    Then Check the Repeat checkbox
    And Clear(delete) the number "1"
    Then Verify the app displays “This value should not be blank.”





