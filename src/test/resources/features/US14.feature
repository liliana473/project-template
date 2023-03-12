Feature: Users should be able to manage filter on Marketing page

  Background: User is already in the log in page
    Given the user is on the login page

@B28G30-172
  Scenario Outline: Verify user can see all 5 filter options are checked by default.
    Given the user logged in as "<userType>"
    When the user navigates to "Marketing" - "Campaigns"
    Then the user click the Manage filter button
    Then the user verifies all checkboxes are checked




    Examples:
      | userType      |
      | store manager |
      | sales manager |


@B28G30-176
  Scenario Outline: Verify user can see all 5 filter options are chected by default.
    Given the user logged in as "<userType>"
    When the user navigates to "Marketing" - "Campaigns"
    Then the user click the Manage filter button
    And uncheck one or more filter options
    Then verify one or more options are unchecked

  Examples:
    | userType      |
    | store manager |
    | sales manager |