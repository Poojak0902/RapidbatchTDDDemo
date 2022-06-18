package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonmethods {
	
	//create common methods

	WebDriver driver;
	public Commonmethods(WebDriver driver ) {
		this.driver = driver;
	}

		//explicit wait >> element level wait

	public void waitforElement(WebElement ele ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
		

	public void higlightement(WebElement ele ) {
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("arguments[0].style.border='2px solid yellow'", ele);
		
	}
	public void Scrollele(WebElement ele ) throws InterruptedException {
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		jsexe.executeScript("arguments[0].scrollIntoView();", ele);
		
		
	}
	public void jsClick(WebElement ele )  {
		
		JavascriptExecutor jsexe= (JavascriptExecutor)driver;
		
		jsexe.executeScript("arguments[0].click();",ele);
		
	}


}
