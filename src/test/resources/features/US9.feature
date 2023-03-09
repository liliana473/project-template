Feature: As a user, I should see error messages when I enter an invalid integer into the calender repeat day input box.

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: US9AC1TC1 Verify that user can see error messages for entering invalid integers
    Given the user logged in as "<userType>"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click the Create Calendar Event button
    Then Check the Repeat checkbox
    And Write a number  less than "1" in Repeat Every box
    And Click the Save And Close button
    Then Verify the app displays “The value have not be less than "1".
    Examples:
      | userType             |
      | sales manager             |
      | store manager             |


  Scenario Outline: US9AC1TC2 Verify that user can see error messages for entering invalid integers
    Given the user logged in as "<userType>"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click the Create Calendar Event button
    Then Check the Repeat checkbox
    And Write a number  more than "99" Repeat Every box
    And Click the Save And Close button
    Then Verify the app displays “The value have not be more than "99".
    Examples:
      | userType             |
      | sales manager             |
      | store manager             |