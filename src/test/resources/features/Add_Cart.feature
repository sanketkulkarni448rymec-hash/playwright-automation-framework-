
Feature: Shopping Cart Functionality
  As a customer
  I want to add products to the cart
  So that I can purchase them later

  Background:
    Given the user navigates to the site
    When the user enters valid username and password
    And the user clicks on the login button
    Then the user should be redirected to the inventory page

  @smoke @cart
  Scenario: Add a single product to the cart successfully
    When the user selects the first available product
    And the user adds the product to the cart
    Then the cart badge should display "1"
    And the cart should contain the selected product