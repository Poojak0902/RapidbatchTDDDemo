package test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.DriverManager;
import utilities.ReadPropertyfile;

public class LaunchMethod {

	WebDriver driver;
	DriverManager dm = new DriverManager();
	ReadPropertyfile readprop;
	Properties prop;
	// String browser = "chrome";
	// String url= "https://www.facebook.com/";

	@BeforeTest(alwaysRun = true)
	@Parameters({ "browser", "url" })
	public void beforeTest(String br, String url) {
		System.out.println("this is before test annotation ");
		/*
		 * readprop = new ReadPropertyfile(); prop= readprop.readpropfile(); //String
		 * url = prop.getProperty("url");
		 * System.out.println(prop.getProperty("browser")+ url);
		 */
		dm.setup(br, url);
		// dm.setup(prop.getProperty("browser"), url);

		driver = DriverManager.getDriver();

	}

	// comment the body of code>> use control shift and press /

	@AfterSuite(alwaysRun = true)
	public void afterTest() {
		System.out.println("this is after test annotation ");
		dm.teardown();
	}

}
