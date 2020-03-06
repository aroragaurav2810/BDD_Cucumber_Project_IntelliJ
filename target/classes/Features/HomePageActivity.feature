@HomePageActivity
Feature: Home Page Activity

Background: User should be logged in and login page should be available
Given login page should be available


Scenario: Navigated to Employee Home Page 

When user clicks on the Employee Home page button 
Then user should be redirected to Employee Home Page
And browser should be closed then

Scenario: Navigated to the Employer Home Page

When user clicks on the Employer Home page button 
Then user should be redirected to Employer Home Page
And browser should be closed again


# Each feature can have one or more scenarios and every scenario consists of one or more steps
# "Background:" keyword: This keyword is used to execute before each scenario. However, it gets executed after “Before” hook (to be covered later).
# So this is ideal to be used for code when we want to set up the web-browser or we want to establish the database connectivity. 
# AND can be used in conjunction with GIVEN, WHEN and THEN statement.
# We can see "And" keyword or annotation in gherkins language but we have not seen "OR" keyword or annotation
# It doesn't mean that gherkins does not have OR, OR functionality is with "But" keyword or annotation 
# But/OR can be used in conjunction with GIVEN, WHEN and THEN statement.
