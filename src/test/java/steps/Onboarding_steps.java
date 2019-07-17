package steps;

import pages.Onboarding_Page;
import base.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Onboarding_steps extends TestBase {
	
	Onboarding_Page onboard = new Onboarding_Page(driver);
	
	@Given("I am in Welcome screen")
	public void i_am_in_Welcome_screen() {
		onboard.isUserInWelcomeScreen(); 
	}

	@When("I login with valid credential")
	public void i_login_with_valid_credential() {
	   onboard.userSignUpProcess();
	}

	@When("accept the cookies confirmation")
	public void accept_the_cookies_confirmation() {
	   onboard.acceptCookies();
	}

	@Then("I am in the home screen")
	public void i_am_in_the_home_screen() {
	   onboard.isUserInHomeScreen();
	}

	@When("I select the hamburger menu")
	public void i_select_the_hamburger_menu() {
	   onboard.launchHamburgerMenu();
	}


	@Then("I can dismiss the menu list")
	public void i_can_dismiss_the_menu_list() {
	    onboard.disMissMenuList();
	}

	@When("I select the icon")
	public void i_select_the_icon() {
	    onboard.launchProfile();
	}

	@Then("the profile details as the contact as {string}")
	public void the_profile_details_as_the_contact_as(String string) {
	    onboard.getContactDetail(string);
	}

	@When("I navigate to home screen")
	public void i_navigate_to_home_screen() {
	    onboard.backtoHomeScreen();
	}

	@When("I scroll down to view the Communities that are listed")
	public void i_scroll_down_to_view_the_Communities_that_are_listed() {
	    onboard.scrollInHomeScreen();
	}

	@When("I logout")
	public void i_logout() {
	   onboard.logOut();
	}

	@Then("I see that the user is navigated to Welcome screen")
	public void i_see_that_the_user_is_navigated_to_Welcome_screen() {
		onboard.isUserInWelcomeScreen();   
	}




}
