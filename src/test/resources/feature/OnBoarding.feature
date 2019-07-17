
@tag
Feature: Onboarding Functionality
  A guest user can view the onboarding screen

  Scenario: Validate user flow of  onboarding screen
    Given I am in Welcome screen
    When I login with valid credential
    And accept the cookies confirmation
    Then I am in the home screen
    When I select the hamburger menu
    And I can dismiss the menu list
    When I select the icon
    Then the profile details as the contact as "manjola.puttasetty@fuseuniversal.com"
    When I navigate to home screen
    And I scroll down to view the Communities that are listed
    And I logout
    Then I see that the user is navigated to Welcome screen
    
    