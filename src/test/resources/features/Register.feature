Feature: Register on site

  @wip
  Scenario Outline: Register as a User
    Given The user is on the login page
    When  The user navigates to the Register.
    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    And The user should be able to register
    Examples:
      | first name | last name | email                | password | confirm password |
      | Cemal      | Oz        | hakan12345@gmail.com | qweasd1  | qweasd1          |

  Scenario Outline:First and Last Name Negatif Test
    Given The user is on the login page
    When  The user navigates to the Register.
    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    Then First and Last Name should not accept numbers "<message>"

    Examples:
      | first name | last name | email                         | password | confirm password | message                     |
      | Cemal1     | Oz        | hakahjxcxchjklbbv@gmail.com   | qweasd1  | qweasd1          | Your registration completed |
      | Cemal      | Oz1       | hakbbhxcxcjhkljhvbv@gmail.com | qweasd1  | qweasd1          | Your registration completed |


