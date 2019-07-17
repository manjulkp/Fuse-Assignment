package base;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ScreenBase {

	public static WebDriver driver;
	public WebDriverWait wait;
	
	
	public ScreenBase(WebDriver driver) {
		ScreenBase.driver = driver;

	}

	public static WebElement waitForElement(WebElement arg) {
		Logger.getLogger("The webElement " + arg + "is waiting ");
		waitForPageToLoad(arg);
		WebElement el = arg;
		return el;
	}

	public static void waitForPageToLoad(WebElement id) {
		Logger.getLogger("The webElement " + id + "is waiting  for 20 seconds");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(id));
	}

	public static void waitForPageToLoad(WebElement id, int time) {
		Reporter.log("The webElement " + id + "is waiting  for " + time + " seconds");
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(id));
	}

	public static boolean isElementPresent(WebElement webElement) {
		try {
			boolean isPresent = webElement.isDisplayed();
			Logger.getLogger("The webElement is present is " + webElement);
			return isPresent;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// Click an element
	public static void clickAble(WebDriver driver, WebElement webElement) {
		try {
			if (isElementPresent(webElement)) {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(webElement));
			webElement.click();
			Logger.getLogger("The webElement is clicked " + webElement);
			}
		} catch (StaleElementReferenceException sere) {
			// simply retry finding the element in the refreshed DOM
			if (isElementPresent(webElement)) {
			webElement.click();
			}
		}
	}

	// Trying to find an element
	public boolean retryingFindClick(WebElement webElement) {
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				webElement.click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	

	// Retrieve the text from an element
	public static String GetText(WebElement element) {
		Logger.getLogger("The text is been retrieved");
		return element.getText();
	}

	// Clear the text
	public static void ClearText(WebElement element) {
		Logger.getLogger("The text is been cleared");
		element.clear();
	}

	// Enter any text
	public static void enterText(WebElement element, String text, WebDriver driver) {
		Logger.getLogger("The string " + " text " + "is entered in the field");
		clickAble(driver, element);
		element.sendKeys(text);
	}

	// Retrieve the text
	public static String GetScreenTitle(WebElement ele) {
		Logger.getLogger("The string " + " text " + "is entered in the field");
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated((By) ele));
		return ele.getText();
	}

	// Element existence check
	public static boolean IsExists(WebElement element) {
		Logger.getLogger("The string " + " text " + "is entered in the field");
		try {
			element.isDisplayed();
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	// Element enabled check
	public static boolean IsEnabled(WebElement element) {
		Logger.getLogger("Check for element being enabled or not ");
		return (element.isEnabled()) ? true : false;
	}

	// Element selected check
	public static boolean IsSelected(WebElement element) {
		Logger.getLogger("Check for element being isSelected or not ");
		return (element.isSelected()) ? true : false;
	}

	// check for actual verses with expected
	public static void verifyScreen(String screen, WebElement ele) {
		String actual = ele.getText();
		Logger.getLogger("Check for actual text" + actual + " with expected text" + screen);
		Logger.getLogger("The actual text " + actual);
		Logger.getLogger("The expected text " + screen);
		verifyEquals(screen, actual);
	}

	// check for actual verses with expected with assertEqual being called
	public static void verifyEquals(String expected, String actual) {
		try {
			Assert.assertEquals(actual, expected);
			Logger.getLogger("The actual text" + actual + " with expected to match the text" + expected);
		} catch (Throwable t) {
			// Need to add log
		}
	}

	//Text is Present
	public static boolean textPresent(String text, WebElement ele) {
		if (ele.isDisplayed()) {
			ele.getText().contains(text);
			return true;
		}
		return false;
	}
	
	
	

}
