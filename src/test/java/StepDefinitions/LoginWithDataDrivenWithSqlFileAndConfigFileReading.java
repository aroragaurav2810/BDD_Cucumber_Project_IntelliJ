package StepDefinitions;

import base.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enumContainer.EnumFile;
import utilities.PropertyFileReader;
import utilities.SqlFileReader;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginWithDataDrivenWithSqlFileAndConfigFileReading

{




    @Given("^browser, url, username and password from configuration\\.properties \"([^\"]*)\" file$")
    public void browser_url_username_and_password_from_configuration_properties_file(String propertyFile) throws Throwable
    {
        System.out.println("property file is "+propertyFile);
        PropertyFileReader pfr=new PropertyFileReader(propertyFile);
        String browserName=pfr.config.getProperty("browser");
        String websiteUrl=pfr.config.getProperty("url");
        String user=pfr.config.getProperty("username");
        String pwd=pfr.config.getProperty("password");
        System.out.println("Browser name is "+browserName);
        System.out.println("WebSiteUrl is "+websiteUrl);
        System.out.println("user name is "+user);
        System.out.println("password is "+pwd);

    }

    @Given("^query from sql \"([^\"]*)\" file$")
    public void query_from_sql_file(String sqlFile) throws Throwable
    {
        System.out.println("property file is "+sqlFile);
        SqlFileReader sfr=new SqlFileReader(sqlFile);
        String query= EnumFile.Country.getQueryAsString();
        // execute a query
        ResultSet rs=sfr.st.executeQuery(query);
        while(rs.next())
        {
            System.out.println(rs.getString(1));
        }
    }

    @When("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable
    {
        System.out.println("first when");
    }

    @Then("^user should be able to login with authorized credential only$")
    public void user_should_be_able_to_login_with_authorized_credential_only() throws Throwable
    {
        System.out.println("first then");
    }

    @Then("^Quit Browser with Sql File And Config File Reading$")
    public void quit_Browser() throws Throwable
    {
        System.out.println("second then");
    }



}
