
Feature: Test login functionality for demowebshop
  
   
   @Register
   Scenario: Test demowebshop with valid credentials
   
   
    Given open chrome and startapplication
    When I enter all valid data
    Then User should be able to register to application
   
  @login
  Scenario: Test demowebshop with valid credentials
   
   
    Given  start application
    When enter valid username and password
    Then User should  able to login
  
