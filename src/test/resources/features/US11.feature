Feature: As a user, I want to view car odometer info on the Vehicles Odometer page
  

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US11AC1TC1 manager can NOT access the "Vehicle Odometer" page
    Given the user logged in as "store manager"
    When the user navigates to "Fleet" - "Vehicle Odometer"
    Then users see an error message as: "You do not have permission to perform this action."



  Scenario: US11AC2TC2 drivers should see the default page number as 1
      Given the user logged in as "driver"
      When the user navigates to "Fleet" - "Vehicle Odometer"
     # Then the user verifies the default page number is 1



      Scenario: US11AC3TC3 Drivers should see the View Per Page is 25 by default
        Given the user logged in as "driver"
        When the user navigates to "Fleet" - "Vehicle Odometer"
       # Then the user verifies the default View Per Page is 25
