package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithDataDrivenWithoutExamplesKeyword 
{
	WebDriver driver=null;
	String browser=null;
// Login With Data Driven Without Example Keyword But With Regular Expression 
	
	@Given("^\"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" without Example Keyword$")
public void withoutExamplesKeyword(String browser, String url, String email, String password) throws Throwable {
	System.out.println("LoginWithDataDrivenWithoutExampleKeyword");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");		
	if(browser.equalsIgnoreCase("chrome"))
	{
	driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("pass")).clear();
	driver.findElement(By.name("pass")).sendKeys(password);
	}
}

@When("^click on login button in order to login without Example Keyword$")
public void click_on_login_button_in_order_to_login() throws Throwable {
	driver.findElement(By.id("loginbutton")).click(); 
    
}

@Then("^user should not be logged in with unauthorized credentials without Example Keyword$")
public void user_should_not_be_logged_in_with_unauthorized_credentials() throws Throwable {
	assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
}

@Then("^Quit Browser without Example Keyword$")
public void quit_Browser() throws Throwable {
	driver.quit();
}

	
}
