package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example9Logging {
	
	WebDriver driver;
    WebDriverWait wait;
    String drivePath="C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe";

    @BeforeTest
    public void beforeClass() {
    	System.setProperty("webdriver.gecko.driver", drivePath);
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
	
	@Test
	public void main() {

	    driver.findElement(By.id("username")).sendKeys("User1");
	    Reporter.log("Typing in Username");

	    driver.findElement(By.id("password")).sendKeys("Test@123");
	    Reporter.log("Typing in Password");

	    driver.findElement(By.id("submitButton")).click();
	    Reporter.log("Logging in");

	    Reporter.log("Login successful.");

	    driver.findElement(By.id("logoutButton")).click();
	    Reporter.log("Loggin out");
	}
	
	@AfterTest
    public void afterClass() {
        //Close browser
        driver.close();
    }
  
}
