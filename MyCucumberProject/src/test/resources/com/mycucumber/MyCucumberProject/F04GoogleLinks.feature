@AllLinks
Feature: Google links


Background:
		Given I open googleIndia

	 @GmailLinks
	 Scenario: Test Gmail link
		When Click on Gmail Link
		Then Gmail page should display
		
	
	 @Images
	 Scenario: Test Images link
		When Click on Images Link
		Then Images page should display
		
	
	 @Advert
	 Scenario: Test Advert link
		When Click on Advert Link
		Then Advert page should display
		
		
	 @Business
	 Scenario: Test Business link
		When Click on Business Link
		Then Business page should display