Feature: Demo Webshop log in Test

  Scenario: Log in as a User
    Given The user is on the login page
    When The user enters valid credentials
    Then The user should be able to login
