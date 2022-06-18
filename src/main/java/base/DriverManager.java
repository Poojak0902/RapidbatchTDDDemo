package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {




	public static WebDriver driver;
	public void setup(String browser, String url) {
		
		             String path=System.getProperty("user.dir");
		             System.out.println("returning the location my dr>> "+ path);
		
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",path+"\\driver\\chromedriver.exe");
			driver=new ChromeDriver();	
			System.out.println(" this is the launched br >> "+ browser);
			
		}else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",path+"\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();
			System.out.println(" this is the launched br >> "+ browser);
		
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",path+"\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();	
			System.out.println(" this is the launched br >> "+ browser);
			
		}else {
			System.out.println("this is not correct choice pf browser>> "+ browser);
		}
		if (url!="") {
			driver.get(url);
			System.out.println("the url is>> "+ url);
		}else {
			driver.get("about:blank");
			System.out.println("the url is blank or not as expected >> "+ url);
		}
		
		driver.manage().window().maximize();
		
		//waits implicit wait >> global
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		}


	public void teardown() {
		driver.quit();
		//driver.close();
	}
	


public static  WebDriver getDriver() {
	return driver;
	
}















}
