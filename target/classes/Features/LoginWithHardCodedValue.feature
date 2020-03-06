@LoginWithHardCodedValue
Feature: login to facebook.com

Scenario: login to facebook.com with hardcoded value

Given browser, url, username and password
When click on login button
Then user should not be logged in with wrong credentials
Then Close Browser


# What is the difference between scenario and scenario outline
# With "Examples:" keyword, we use "Scenario Outline:" keyword otherwise, we can use "Scenario" keyword  
# While working on cucumber, we should be aware that it is case sensitive and required it's code to be written in order wise 
# like "Feature:" keyword should be written on the first line and then we can go on "Scenario:/Scenario Outline:/further" keywords
# Example of few other keywords − And, Background, But etc
# Gherkins not even supports english, it also supports hindi, gujrati, urdu, indonasian, french, etc  
# "Description:" An (optional) keyword− Describe about feature under test.
# Instead of writing Then two times , you could also use AND
# AND can be used in conjunction with GIVEN, WHEN and THEN statement.

