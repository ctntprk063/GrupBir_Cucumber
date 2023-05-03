Feature: Demo Webshop log in Test

  @wip
  Scenario: Log in as a User
    Given The user is on the login page
    When The user enters valid credentials
    Then The user should be able to login

  @wip
  Scenario Outline:Login Negatif Test
    Given The user is on the login page
    When  The user enters "<userName>" and "<password>"
    Then The user should be able not to login
    And The user take a text contain"<message>"
    Examples:
      | userName        | password | message      |
      | abc@gmail.com   | 1234     | unsuccessful |
      |                 | sifreyok | unsuccessful |
      | grup1@gmail.com |          | unsuccessful |
      |                 |          | unsuccessful |


@wip
  Scenario Outline:Email Adresse Negatif Test
    Given The user is on the login page
    When  The user enters "<userName>" and "<password>"
    Then The user should be able not to login
    And The user must take a text contain"<message>"
    Examples:
      | userName        | password | message     |
      | abcgmail.com    | sifreyok | a valid email |
      | @abc.gmail.com  | sifreyok | a valid email |
      | grup1gmail.com@ | sifreyok | a valid email |
      | abc@gmail       | sifreyok | a valid email |
      | abc@gmail@      | sifreyok | a valid email |








