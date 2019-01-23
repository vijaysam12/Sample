Feature: Login functionality for automation practis application
It contains 3 scenarios includes Valid Crendentails, Invalid crendentials etc

Scenario: Verify login functionslity with valid credentials
Given User hit the Automation Practise Application
When User click sign in button in the header
And User wait for page load
And User enter the email address "sampletest@gma8il.com"
And User enter the password "abc@xyz"
And User click on create account button

Scenario Outline: Verify login functionality for multiple user
Given User hit the Automation Practise Application
When User click sign in button in the header
And User wait for page load
And User enter the email address "Email"
And User enter the password "PassWord"
And User click on create account button

Examples:
|Email					|PassWord|
|test1@test.com	|abc	 	 |
|test2@test.com	|abc	 	 |
|test3@test.com	|abc	 	 |
