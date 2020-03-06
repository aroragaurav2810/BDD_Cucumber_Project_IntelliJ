Feature: Login with facebook

Scenario: login to facebook.com with data driven with DataTable

Given login with browser, url, username and password using DataTable 
 |https://www.facebook.com| testuser_1 | Test@153 |
When click on login button in order to login with DataTable
Then user should not be logged in with unauthorized credentials with DataTable 
And Quit Browser with DataTable



