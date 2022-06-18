package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LoginAction;

public class LoginValidations extends LaunchMethod {

	LoginAction login;

	@BeforeClass(alwaysRun = true)
	public void beforeclass() {
		login = new LoginAction(driver);
	}
 
	
	
	@Parameters({"validemail","Validpassword"})
	@Test()
	public void validUNandValidPassword(String un, String pw) {
		Assert.assertTrue(login.Username.isEnabled(), "Username field is not enabled");
		Assert.assertTrue(login.Username.getAttribute("aria-label").contains("Email or phone number"),
				"This is not correct username attribute");

		Assert.assertTrue(login.Password.isEnabled(), "Password field is not enabled");
		Assert.assertTrue(login.Password.getAttribute("aria-label").contains("Password"),
				"This is not correct username attribute");
		login.passEmailandPassword(un, pw);
	}
	
	
	
	@Parameters({"invalidemail","Validpassword"})
	@Test(groups = { "Regression", "Sanity"})
	public void invalidUNandValidPassword(String un, String pw) {
		Assert.assertTrue(login.Username.isEnabled(), "Username field is not enabled");
		Assert.assertTrue(login.Username.getAttribute("aria-label").contains("Email or phone number"),
				"This is not correct username attribute");

		Assert.assertTrue(login.Password.isEnabled(), "Password field is not enabled");
		Assert.assertTrue(login.Password.getAttribute("aria-label").contains("Password"),
				"This is not correct username attribute");
		login.passEmailandPassword(un, pw);
	}
	@Parameters({"validemail","inValidpassword"})
	@Test(groups = {  "Sanity", "SIT" })
	public void validUNandinValidPassword(String un, String pw) {
		Assert.assertTrue(login.Username.isEnabled(), "Username field is not enabled");
		Assert.assertTrue(login.Username.getAttribute("aria-label").contains("Email or phone number"),
				"This is not correct username attribute");

		Assert.assertTrue(login.Password.isEnabled(), "Password field is not enabled");
		Assert.assertTrue(login.Password.getAttribute("aria-label").contains("Password"),
				"This is not correct username attribute");
		login.passEmailandPassword(un, pw);
	}
	@Parameters({"invalidemail","inValidpassword"})
	@Test(groups = { "Regression" })
	public void invalidUNandinValidPassword(String un, String pw) {
		Assert.assertTrue(login.Username.isEnabled(), "Username field is not enabled");
		Assert.assertTrue(login.Username.getAttribute("aria-label").contains("Email or phone number"),
				"This is not correct username attribute");

		Assert.assertTrue(login.Password.isEnabled(), "Password field is not enabled");
		Assert.assertTrue(login.Password.getAttribute("aria-label").contains("Password"),
				"This is not correct username attribute");
		login.passEmailandPassword(un, pw);
	}
	@Test(dependsOnMethods = { "validUNandValidPassword" })
	public void alidateloginclick() {
		Assert.assertTrue(login.Loginbutton.isEnabled(), "Username field is not enabled");
		String expectedtext = "Log In";
		String actual = login.Loginbutton.getText();
		Assert.assertTrue(expectedtext.contains(actual), "This is not correct text of Login");
		login.clicklogin();
	}


	
	
	
	
	
	
	
	/*
	 * @Test(dataProvider="dplogin") public void jsonlogintest(String data) {
	 * //driver.navigate().refresh(); String[] arr= data.split(",");
	 * 
	 * login.Username.clear(); login.Username.sendKeys(arr[0]);
	 * 
	 * login.Password.clear(); login.Password.sendKeys(arr[1]);
	 * 
	 * System.out.println(arr);
	 * 
	 * }
	 * 
	 * @DataProvider(name ="dplogin") public String[] readjsonfile() throws
	 * IOException, ParseException {
	 * 
	 * 
	 * JSONParser json = new JSONParser(); FileReader file = new
	 * FileReader(".\\Logintestdata.json"); Object obj=json.parse(file);
	 * 
	 * JSONObject jsonfile=(JSONObject)obj; JSONArray
	 * userdetailsArray=(JSONArray)jsonfile.get("userlogin");
	 * 
	 * String[] arr = new String[userdetailsArray.size()]; for (int i = 0; i
	 * <userdetailsArray.size(); i++) { JSONObject
	 * users=(JSONObject)userdetailsArray.get(i); String un=
	 * (String)users.get("un"); String pw= (String) users.get("pw");
	 * 
	 * arr[i]=un+","+pw+",";
	 * 
	 * } return arr; }
	 */

}
