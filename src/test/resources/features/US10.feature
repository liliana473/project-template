Feature: As a user I want to write the “Description” when I create a calendar event. (Iframe)

  Background: User is already in the log in page
    Given the user is on the login page

  @wip

  Scenario Outline: US10AC1TC1 Verify that user write the "Description" when I create a calendar event.
    Given the user logged in as <userType>
    And the user navigates to "Activities" - "Calendar Events"
    And Click the “Create Calendar Event” button
    And user enters value in the Description field
    Then the user Verify the "Scrum Daily Meeting" is written in the input box

    Examples:
      | userType        |
      | "sales manager" |
      #| "store manager" |
      #| "driver"        |