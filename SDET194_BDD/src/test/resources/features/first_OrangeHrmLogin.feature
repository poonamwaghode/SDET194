Feature: OrangeHRM Login

  Scenario: Successful login with valid credentials
    Given the user is on the OrangeHRM login page
    When the user enters the username "Admin"
    And the user enters the password "admin123"
    And the user clicks the login button
    Then the user will be in the application
   

