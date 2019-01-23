Feature: Login functionality for automation practis application
It contains 3 scenarios includes Valid Crendentails, Invalid crendentials etc

Scenario: User verify the login functionlity with valid credentials
    Given User hit the Automation Practise Application
    And User wait for page load
    When User click sign in button in the header
    And User wait for page load
    And User enter the email address
    And User click on create account button
    Then User validate the user email id
    
  Scenario: User enter his detail to register
  And User click on mr button
  And User enter first name "Firstname"
  And User enter last name
	And User enter the password
	And User Dropdown and click on days by value
	And user Dropdown and click on months by value
	And user Dropdown and click on years by value
	And user click on newsletter to suscribe button
	And user enter the first name
	And user enter the last name
	And user enter the Company name
	And user enter the first Address
	And user enter the Second Address
	And user enter the city 
	And user enter the postcode number
	And user Dropdown and click state by value
	And user enter the country 
	And user enter the Additional information
	And user enter the home phone number
	And user enter the mobile number
	And user enter the reference email address
	And User click register button to complete register
	Then user valid and register 
	
Scenario: user select Tshirt and add to cart
	And user click on tshirt to enter tshirt item
	And user click on size in short,medium or large
	And user click on composition checkbox
	And user click on styles checkbox
	And user click on properties checkbox
	And user click on avaliability checkbox
	And user click on manufacture checkbox
	And user click on condition checking
	And user dropdown and click on lowest first in value based
	Then user mouseover on stock 
	And user click on stock to add to cart
	Then user wait for page load 
	And user click on conntinue shopping
	Then user wait for page load
	
Scenario: user select dress and proceed to checkout
And user mouserover on dress to enter any category
And user click on Causal dress and enter the next page
	And user wait for page load
	And user click on size in short,medium or large
	And user click on composition checkbox
	And user click on styles checkbox
	And user click on properties checkbox
	And user click on avaliability checkbox
	And user click on manufacture checkbox
	And user click on condition checking
	And user dropdown and click on lowest first in value based
	Then user mouseover on stock 
	And user click on stock to add to cart
	Then user wait for page load 
	And user click on  proceed to checkout
	Then user wait for page load


	
	
	
