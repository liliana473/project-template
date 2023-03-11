@B28G30-164
Feature: Default

	Background:
		#@B28G30-161
		 Given  the user is on the login page
		

	@B28G30-162
	Scenario Outline: US1TC1 Verify that user can access Vehicle Model page
		Given the user logged in as "<user>"
		    When the user navigates to "Fleet" - "Vehicles Model"
		    Then the user should see below options
		
		      | MODEL NAME               |
		      | MAKE                     |
		      | CAN BE REQUESTED         |
		      | CVVI                     |
		      | CO2 FEE (/MONTH)         |
		      | COST (DEPRECIATED)       |
		      | TOTAL COST (DEPRECIATED) |
		      | CO2 EMISSIONS            |
		      | FUEL TYPE                |
		      | VENDORS                  |
		    Examples:
		      | user          |
		      | sales manager |
		      | store manager |	

	@B28G30-163
	Scenario:  US1TC2 Verify that user can not access Vehicle Model page
		Given the user logged in as "driver"
		    And  the user navigates to "Fleet" - "Vehicles Model"
		    Then users see an error message as: "You do not have permission to perform this action."