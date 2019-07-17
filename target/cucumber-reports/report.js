$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/OnBoarding.feature");
formatter.feature({
  "name": "Onboarding Functionality",
  "description": "  A guest user can view the onboarding screen",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Validate user flow of  onboarding screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Welcome screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Onboarding_steps.i_am_in_Welcome_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login with valid credential",
  "keyword": "When "
});
formatter.match({
  "location": "Onboarding_steps.i_login_with_valid_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "accept the cookies confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "Onboarding_steps.accept_the_cookies_confirmation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am in the home screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Onboarding_steps.i_am_in_the_home_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the hamburger menu",
  "keyword": "When "
});
formatter.match({
  "location": "Onboarding_steps.i_select_the_hamburger_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can dismiss the menu list",
  "keyword": "And "
});
formatter.match({
  "location": "Onboarding_steps.i_can_dismiss_the_menu_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the icon",
  "keyword": "When "
});
formatter.match({
  "location": "Onboarding_steps.i_select_the_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the profile details as the contact as \"manjola.puttasetty@fuseuniversal.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Onboarding_steps.the_profile_details_as_the_contact_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to home screen",
  "keyword": "When "
});
formatter.match({
  "location": "Onboarding_steps.i_navigate_to_home_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I scroll down to view the Communities that are listed",
  "keyword": "And "
});
formatter.match({
  "location": "Onboarding_steps.i_scroll_down_to_view_the_Communities_that_are_listed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I logout",
  "keyword": "And "
});
formatter.match({
  "location": "Onboarding_steps.i_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see that the user is navigated to Welcome screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Onboarding_steps.i_see_that_the_user_is_navigated_to_Welcome_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});