package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginWithDataDrivenWithDataTable
{
	WebDriver driver=null;
	String browser=null;
	@Given("^login with browser, url, username and password using DataTable$")
	public void login_with_browser_url_username_and_password_using_DataTable(DataTable usercredentials) throws Throwable 
	{
		List<List<String>> data = usercredentials.raw();
		System.out.println(data);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		browser = "chrome";
		if (browser.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
			driver.get(data.get(0).get(0));
		} 
		//This is to get the first data of the set (First Row + First Column)
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(1));
		
		//This is to get the first data of the set (First Row + Second Column)
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(data.get(0).get(2));
		
		driver.findElement(By.id("loginbutton")).click(); 
		 
	}
	
	
	@When("^click on login button in order to login with DataTable$")
	public void click_on_login_button_in_order_to_login_with_DataTable() throws Throwable 
	{
	    
	}
	
	@Then("^user should not be logged in with unauthorized credentials with DataTable$")
	public void user_should_not_be_logged_in_with_unauthorized_credentials_with_DataTable() throws Throwable 
	{
	    
	}
	
	@Then("^Quit Browser with DataTable$")
	public void quit_Browser_with_DataTable() throws Throwable 
	{
	  
	}
	
	
}
