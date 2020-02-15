Feature: Testing the new search filters
	The user should be able to use the new search filter to find a hotel
	
Scenario: Search for a hotel on the booking website
	Given User navigates to booking website 
	And User User enters a location
	And User enters from and to date
	And User enters number of people
	And User enters number of room
	And User clicks at search button
	And User chooses a filter
	Then User should see if the hotel is listed or not