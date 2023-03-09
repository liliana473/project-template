Feature: Users should be able to manage filter on Marketing page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify user can see all 5 filter options are chected by default.
    Given the user logged in as "<userType>"
    When the user navigates to "Marketing" - "Campaigns"
    Then the user click the Manage filter button
    And verify "5" options are checked by default


    #  | Name       |
     # | Code       |
    #  | Start Date |
    #  | End Date   |
    #  | Budget     |

    Examples:
      | userType      |
      | store manager |
      | sales manager |



  Scenario: Verify user can see all 5 filter options are chected by default.
    Given the user logged in as "<userType>"
    When the user navigates to "<Marketing>" - "<Campaigns>"
    Then the user click the Manage filter button
    And uncheck one or more filter options
    Then verify one or more options are unchecked