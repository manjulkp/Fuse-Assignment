package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ScreenBase;

public class Onboarding_Page extends ScreenBase {

	public Onboarding_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user_login_name")
	private WebElement enterEmail;

	@FindBy(id = "user_password")
	private WebElement enterPassword;

	@FindBy(xpath = "//input[@value='Sign in']")
	private WebElement signInButton;

	@FindBy(linkText = "Accept")
	private WebElement acceptCookies;

	@FindBy(xpath = "//span[@class='b-topbar-sidemenu-link-button']")
	private WebElement menuButton;

	@FindBy(linkText = "Recently added content")
	private WebElement recentlyAddedContent;

	@FindBy(linkText = "Home")
	private WebElement homeInMenuList;
	
	@FindBy(xpath = "//img[@class='b-my-profile-image']")
	private WebElement myProfile;
	
	@FindBy(xpath = "//div[@class='b-user-email']")
	private WebElement contactEmail;
	
	@FindBy(linkText = "RF Community")
	private WebElement Community;
	
	@FindBy(xpath = "//a[@title='Log out']")
	private WebElement Logout;
	
	

	public void isUserInWelcomeScreen() {
		Assert.assertTrue(isElementPresent(enterEmail), "The Welcome is not loaded");
	}

	public void userSignUpProcess() {
		enterText(enterEmail, "manjula", driver);
		enterText(enterPassword, "manjula", driver);
		clickAble(driver, signInButton);

	}

	public void acceptCookies() {
		clickAble(driver, acceptCookies);
	}

	public void isUserInHomeScreen() {
		Assert.assertTrue(isElementPresent(recentlyAddedContent), "The user is not in HomeScreen");

	}

	public void launchHamburgerMenu() {
		clickAble(driver, menuButton);
		Assert.assertTrue(isElementPresent(homeInMenuList), "The menu list is not launched");

	}

	public void disMissMenuList() {
		clickAble(driver, homeInMenuList);
	}
	
	public void launchProfile()
	{
		clickAble(driver, myProfile);
	}
	
	public void getContactDetail(String email)
	{
		Assert.assertTrue(GetText(contactEmail).equals(email),"The user email is matched");
	}
	
	public void backtoHomeScreen()
	{
		clickAble(driver, homeInMenuList);
	}
	
	public void scrollInHomeScreen()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Assert.assertTrue(isElementPresent(Community), "The web view  is not scrolled and the user cannot view the communities");

	}
	
	public void logOut()
	{
		clickAble(driver, menuButton);
		clickAble(driver, Logout );
	}
	

}
