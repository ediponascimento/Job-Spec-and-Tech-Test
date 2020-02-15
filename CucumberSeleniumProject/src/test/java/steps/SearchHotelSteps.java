package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchHotelSteps {
	@Given("^User navigates to booking website$")
	public void user_navigates_to_booking_website() throws Throwable {
	   System.out.println("User navigates to booking website");
	}

	@Given("^User User enters a location$")
	public void user_User_enters_a_location() throws Throwable {
	    System.out.println("User User enters a location");
	}

	@Given("^User enters from and to date$")
	public void user_enters_from_and_to_date() throws Throwable {
	    System.out.println("User enters from and to date");
	}

	@Given("^User enters number of people$")
	public void user_enters_number_of_people() throws Throwable {
	    System.out.println("User enters number of people");
	}

	@Given("^^User enters number of room$")
	public void user_enters_number_of_room() throws Throwable {
	    System.out.println("user enters number of room");
	}

	@Given("^User clicks at search button$")
	public void user_clicks_at_search_button() throws Throwable {
	    System.out.println("the user click at search button");
	}

	@Given("^User chooses a filter$")
	public void user_chooses_a_filter() throws Throwable {
	    System.out.println("the user chooses a filter");
	}

	@Then("^User should see if the hotel is listed or not$")
	public void user_should_see_if_the_hotel_is_listed_or_not() throws Throwable {
	    System.out.println("User should see if the hotel is listed or not");
	}
}
