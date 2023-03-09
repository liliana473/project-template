Feature:  As a user, I want to learn how to use the pinbar.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: US3AC1TC1 Verify users learn how to use the pinbar
    Given the user logged in as "driver"
    When user click the Learn how to use this space message
    Then Verify the users see "<message1>" and "<message2>":

    Examples:
      | message1          | message2                                                                                       |
      | How To Use Pinbar |Use pin icon on the right top corner of page to create fast access link in the pinbar.|

  Scenario: US3AC1TC2  VERIFY users see an image on the pinbar page
    Given the user logged in as "driver"
    When user click the Learn how to use this space message
    Then verify the user see image
    Then verify img source expected as "https://qa.translantik.com/bundles/oronavigation/images/pinbar-location.jpg"

