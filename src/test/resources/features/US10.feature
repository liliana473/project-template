@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US10AC1TC1 Verify that user write the "Description" when I create a calendar event.
    Given the user logged in as "store manager"
    When the user navigates to "Activities" - "Calendar Events"
    And the user click the Create Calendar Event button
    And user enters value in the Description field
    Then the user Verify the "Scrum Daily Meeting" is written in the input box

