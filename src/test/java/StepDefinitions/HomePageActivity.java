package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageActivity 

{


	
	  	WebDriver driver=null; 
	  	String browser=null;

		@Given("^login page should be available$")
		public void login_page_should_be_available() throws Throwable 
		{
			System.out.println("HomePageActivity");
			System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
			browser = "chrome";
			if (browser.equalsIgnoreCase("chrome")) 
			{
				driver = new ChromeDriver();
				driver.get("https://facebook.com");
			}
		}
	 

		
		@When("^user clicks on the Employee Home page button$")
		public void user_clicks_on_the_Employee_Home_page_button() throws Throwable {
		   System.out.println("user_clicks_on_the_Employee_Home_page_button");
		}
		
		@Then("^user should be redirected to Employee Home Page$")
		public void user_should_be_redirected_to_Employee_Home_Page() throws Throwable {
			System.out.println("user_should_be_redirected_to_Employee_Home_Page");
		}
		
		@Then("^browser should be closed then$")
		public void browser_should_be_closed_then() throws Throwable {
			System.out.println("browser_should_be_closed_then");
			driver.close();
		}
		
		@When("^user clicks on the Employer Home page button$")
		public void user_clicks_on_the_Employer_Home_page_button() throws Throwable {
			System.out.println("user_clicks_on_the_Employer_Home_page_button");
		}
		
		@Then("^user should be redirected to Employer Home Page$")
		public void user_should_be_redirected_to_Employer_Home_Page() throws Throwable {
			System.out.println("user_should_be_redirected_to_Employer_Home_Page");
		}
		
		
		@Then("^browser should be closed again$")
		public void browser_should_be_closed_again() throws Throwable {
			System.out.println("browser_should_be_closed_again");
			driver.close();
		}

	
		
	
	
	
	
	
	
	
}
