Feature: This feature file can have testcases or functionality specific to google search.
  
  #/Volumes/Renuka/SA2410010/MyCucumberProject/src/test/resources/com/mycucumber/MyCucumberProject/F02GoogleSearch.feature
  Scenario: To validate google search functionality
  Given I open google
  When I enter text in searchbox
  And I hit enter
  Then valid search should display
