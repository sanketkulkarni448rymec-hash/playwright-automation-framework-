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
   
    Scenario: Add Employee 
    
    Given User click on PIM Menu
    And click on Add button 
    And Enter the First name of the employee
    And Enter the Last name of the employee
    And Click on Save button
    Then Validate Employee is created
    
    Scenario:

    Given User click on PIM Menu  
    When Search with employee name
    And click on Search
    And click on Employee
    And Enter the details
    And Click on Save
    Then Validate the employee update with Person details
    
    
    
    
    
    
    
    
    
    
    
    