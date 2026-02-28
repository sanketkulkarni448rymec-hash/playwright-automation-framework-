
Feature: Login functionality
 
  Scenario: Successful login
 
    Given User launches the browser
    When User enters username "student "
    And User enters password "Password123"
    And User clicks login button
  #  Then User should see dashboard page