@LoginWithDataDrivenWithoutExamplesKeyword
Feature: login to facebook

Scenario: login to facebook.com with data driven without Example Keyword

Given "Chrome" , "https://www.facebook.com" , "gauravarora.cse@gmail.com" and "admin123" without Example Keyword
When click on login button in order to login without Example Keyword
Then user should not be logged in with unauthorized credentials without Example Keyword 
Then Quit Browser without Example Keyword

# Add Comment in feature file with #

# What is the difference between scenario and scenario outline
# With "Examples:" keyword, we use "Scenario Outline:" keyword otherwise, we can use "Scenario" keyword  
# While working on cucumber, we should be aware that it is case sensitive and required it's code to be written in order wise 
# like "Feature:" keyword should be written on the first line and then we can go on "Scenario:/Scenario Outline:/further" keywords
# Example of few other keywords − And, Background, But etc
# Gherkins not even supports english, it also supports hindi, gujrati, urdu, indonasian, french, etc
# Instead of writing Then two times , you could also use AND
# AND can be used in conjunction with GIVEN, WHEN and THEN statement.
