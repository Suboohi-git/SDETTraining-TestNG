package testNGActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver= new FirefoxDriver();
		//Create a new instance of the Firefox driver
		  //String drivePath="C:\\Selenium\\Workspace\\SU-CSE-IBM\\drivers\\geckodriver.exe";
		  String drivePath="C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe";
		  System.setProperty("webdriver.gecko.driver", drivePath);
	      //driver = new FirefoxDriver();
		  FirefoxDriver driver= new FirefoxDriver();
			//Thread.sleep(5000);
			driver.get("https://www.google.com");
			//driver.get("https://35.154.168.2");
			driver.quit();
	      //Open browser
	      //driver.get("https://www.training-support.net");
	      

	}

}
