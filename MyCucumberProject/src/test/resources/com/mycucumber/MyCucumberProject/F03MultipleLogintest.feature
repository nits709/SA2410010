Feature: Validate the login functionality with valid and invalid testdata


Background: 
		Given Open Practice test URl in browser
		
 Scenario: To validate login with valid credentials
	When user enter a valid "student" username 
	When user enter a valid password "Password123"
	And user click on login button
	Then Home page should display
	Then User close the browser
	
	
	Scenario: To validate login with invalid credentials
	When user enter a valid "Arun" username 
	When user enter a valid password "Password123"
	And user click on login button
	Then Home page should display
	Then User close the browser