package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.DriverManager;
import utilities.Commonmethods;

public class LoginAction {


// POM startegy = a way of calling loactors
	//Actions on user actions with selenium funtion on url with HTML

WebDriver driver;
Commonmethods common = new Commonmethods(DriverManager.getDriver());

//constructor parameterised >> driver 

public LoginAction(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

//WebElem ele=driver.findeme

@CacheLookup
@FindBy(id="email")
public WebElement Username;

@CacheLookup
@FindBy(id="pass")
public WebElement Password;


@CacheLookup
@FindBy(tagName = "button")
public WebElement Loginbutton;





public void passEmailandPassword(String un, String pw) {
	common.higlightement(Username);
	Username.clear();
	Username.sendKeys(un);
	common.higlightement(Password);
	Password.clear();
	Password.sendKeys(pw);
}

public void clicklogin() {
	common.higlightement(Loginbutton);
	Loginbutton.click();
	//common.jsClick(Loginbutton);
}




}
