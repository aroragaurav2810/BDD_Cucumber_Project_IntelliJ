@LoginWithDataDrivenWithSqlFileAndConfigFileReading
Feature: Login to facebook

  Scenario Outline: login to facebook.com with data driven with Example Keyword having external data sources

    Given browser, url, username and password from configuration.properties "<propertyFile>" file
    And   query from sql "<sqlFile>" file
    When user clicks on login button
    Then user should be able to login with authorized credential only
    And Quit Browser with Sql File And Config File Reading

    Examples:
    |propertyFile                    | sqlFile|
    |configuration.properties        | Countries.sql|


