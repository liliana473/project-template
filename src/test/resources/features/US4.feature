
Feature: User able to access to Vehicle contracts page

  Accounts are : Sales Manager , Store Manager , Drivers

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: US4AC1TC1 Verify that user can access the Vehicle contracts page
    Given the user logged in as "store manager"
    When the user navigates to "Fleet" - "Vehicle Contracts"
    And the title contains "All - Vehicle Contract - Entities - System - Car - Entities - System"
    Then the page url is "https://qa.translantik.com/entity/Extend_Entity_VehicleContract"



  Scenario: US4AC1TC1 Verify that user can access the Vehicle contracts page
    Given the user logged in as "sales manager"
    When the user navigates to "Fleet" - "Vehicle Contracts"
    Then the title contains "All - Vehicle Contract - Entities - System - Car - Entities - System"
    Then the page url is "https://qa.translantik.com/entity/Extend_Entity_VehicleContract"




  Scenario: US4AC2TC1 Verify Drivers can NOT access the Vehicle contracts page
    Given the user logged in as "driver"
    When the user navigates to "Fleet" - "Vehicle Contracts"
    Then users see an error message as: "You do not have permission to perform this action."



