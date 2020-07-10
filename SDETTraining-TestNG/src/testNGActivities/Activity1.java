package testNGActivities;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Activity1 {
	
	 String drivePath="C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe";
	 WebDriver driver;
	
  @BeforeMethod

  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver", drivePath);
	     //driver = new FirefoxDriver();
	  driver= new FirefoxDriver();
      
      //Open browser
      driver.get("https://www.training-support.net");

  }
  
  @Test

  public void exampleTestCase() {

      // Check the title of the page
      String title = driver.getTitle();
      //Print the title of the page
      System.out.println("Page title is: " + title);
      //Assertion for page title
      Assert.assertEquals("Training Support", title);
      //Find the clickable link on the page and click it
      driver.findElement(By.id("about-link")).click();
      //Print title of new page
      System.out.println("New page title is: " + driver.getTitle());
      Assert.assertEquals(driver.getTitle(), "About Training Support");

  }

  @AfterMethod

  public void afterMethod() {

      //Close the browser
      driver.quit();

  }

}
