@LoginWithDataDrivenWithExamplesKeyword
Feature: login to facebook

Scenario Outline: login to facebook.com with data driven with Example Keyword

Given "<browser>", "<url>", "<email>" and "<password>"
When click on login button in order to login  
Then user should not be logged in with unauthorized credentials 
Then Quit Browser

Examples:
| browser | url | email | password |
| chrome | https://www.facebook.com | arora.gaurav2810@gmail.com | admin123 |
| chrome | https://www.facebook.com | arora.gaurav3820@gmail.com | admin456 |



# Examples keyword in BDD is just like dataProvider keyword in TDD
# Similary, TestRunner.java(extends AbstractTestNGCucumberTests) of BDD is just like testNg.xml file of TDD 
# This Data Driven approach is for multiple data 
# NOTE: With this Data Driven approach, you should use <> angular bracket with variables like : "<browser>", "<url>","<email>","<password>" etc
# What is the difference between scenario and scenario outline
# With "Examples:" keyword, we use "Scenario Outline:" keyword otherwise, we can use "Scenario" keyword  
# While working on cucumber, we should be aware that it is case sensitive and required it's code to be written in order wise 
# like "Feature:" keyword should be written on the first line and then we can go on "Scenario:/Scenario Outline:/further" keywords
# Example of few other keywords − And, Background, But etc
# Gherkins not even supports english, it also supports hindi, gujrati, urdu, indonasian, french, etc
# Instead of writing Then two times , you could also use AND
# AND can be used in conjunction with GIVEN, WHEN and THEN statement.

# Add Comment in feature file with 