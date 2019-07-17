package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions= new ChromeOptions();
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/src/test/resources/executable/chromedriver");
		 WebDriver driver = new ChromeDriver(chromeOptions);
    	
        String baseUrl = "https://rainforestqa.staging.fuseuniversal.com/users/sign_in";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();


	}

}
