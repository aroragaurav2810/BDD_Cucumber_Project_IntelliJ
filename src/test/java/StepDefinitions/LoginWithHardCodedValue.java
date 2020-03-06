package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithHardCodedValue {
	
	WebDriver driver=null;
	String browser=null;
	@Given("^browser, url, username and password$")
	public void browser_url_username_and_password() throws Throwable {
		System.out.println("LoginWithHardCodedValue");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");
		browser="chrome";
		if(browser.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("gauravarora.epri@gmail.com");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("admin123");
		}
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();
	   
	}

	@Then("^user should not be logged in with wrong credentials$")
	public void user_should_not_be_logged_in_with_wrong_password() throws Throwable {
		assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
		
	}

	@Then("^Close Browser$")
	public void close_browser() throws Throwable {
		driver.quit();
		
	}

}
