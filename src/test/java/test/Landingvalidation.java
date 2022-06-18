package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.DriverManager;

public class Landingvalidation extends LaunchMethod{
  
	
	//for validation > expected and actual 
	WebDriver driver;
	
	@BeforeClass(alwaysRun = true)
	public void calldriver() {
		driver=DriverManager.getDriver();
	}
	
	@Test
  public void validatetitle() {
		String Expectedtitle= "Facebook - log in or sign up";
		
		String actualtitle=driver.getTitle();
		
		Assert.assertTrue(Expectedtitle.equalsIgnoreCase(actualtitle), "This is not correct title");
		
	}
	
	@Test (groups= {"Regression"})
  public void validateurl() {
String Expectedurl= "https://www.facebook.com/";
		
		String actualurl=driver.getCurrentUrl();
		
		Assert.assertTrue(Expectedurl.equalsIgnoreCase(actualurl), "This is not correct url");
		
		
  }
}
