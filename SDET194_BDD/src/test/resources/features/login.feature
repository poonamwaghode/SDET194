Feature: OrangeHRM Login

  Scenario: Successful login with valid credentials
    Given the user is on the OrangeHRM login page
    When the user enters the username "Admin"
    And the user enters the password "admin123"
    And the user clicks the login button
    Then the user should be redirected to the dashboard

  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the OrangeHRM login page
    When the user enters the username "InvalidUser"
    And the user enters the password "InvalidPassword"
    And the user clicks the login button
    Then an error message should be displayed
