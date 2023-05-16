Feature: Register on site

  Background:
    Given The user is on the login page
    When  The user navigates to the Register.

  Scenario Outline: Register as a User

    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    And The user should be able to register
    Examples:
      | first name | last name | email                | password | confirm password |
      | Cemal      | Oz        | hakan12345@gmail.com | qweasd1  | qweasd1          |


  Scenario Outline:First and Last Name Negatif Test

    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    Then First and Last Name should not accept numbers "<message>"
    Examples:
      | first name | last name | email                         | password | confirm password | message                     |
      | Cemal1     | Oz        | hakahjxvxcx45cxcfg@gmail.com  | qweasd1  | qweasd1          | Your registration completed |
      | Cemal      | Oz1       | hakbbhxvbx12cxfgfgv@gmail.com | qweasd1  | qweasd1          | Your registration completed |


  Scenario Outline:First and Last Name Negatif Test1

    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    And First Name cannot be left blank "<message1>"
    Examples:
      | first name | last name | email                 | password | confirm password | message1                |
      |            | Oz1       | hakbbhxvbv1@gmail.com | qweasd1  | qweasd1          | First name is required. |


  Scenario Outline:Password Negatif Test1

    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    And The password should have at least six characters. "<message2>"

    Examples:
      | first name | last name | email                    | password | confirm password | message2                                        |
      | kadir      | Oz1       | hakbbhxvbvfgh1@gmail.com | 12345    | 12345            | The password should have at least 6 characters. |


  Scenario Outline:Email Negatif Test1

    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    And email cannot be left blank "<message3>"


    Examples:
      | first name | last name | email | password | confirm password | message3           |
      | kadir      | Oz1       |       | 123456   | 123456           | Email is required. |

  @wip
  Scenario Outline:Email Negatif Test1

    Then The user enters "<first name>" and "<last name>" and "<email>" and "<password>" and "<confirm password>" registers credentials
    And Email address should not be accepted without the @sign "<message4>"
    Examples:
      | first name | last name | email           | password | confirm password | message4    |
      | kadir      | Oz1       | haktangmail.com | 123456   | 123456           | Wrong email |