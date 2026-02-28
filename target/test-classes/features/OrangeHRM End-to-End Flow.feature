Feature: Login Functionality

Feature: Login to OrangeHRM

  Scenario: Successful login with valid credentials
    Given user is on the OrangeHRM login page
    When user enters valid username "Admin"
    And user enters valid password "admin123"
    And user clicks on login button
    Then user should be redirected to dashboard page
    #And dashboard title should be displayed

  #Scenario: Login with invalid credentials
    #Given user is on the OrangeHRM login page
   # When user enters invalid username "Admin1"
   ## And user enters invalid password "wrong123"
   # And user clicks on login button
   #Then error message "Invalid credentials" should be displayed