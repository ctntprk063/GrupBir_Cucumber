Feature:  Shopping Cart Functionalitiy
  Background:
    Given The user is on the login page
    When The user enters valid credentials
    Then The user should be able to login

  @wip
  Scenario:View the shopping cart
    And  The user navigates to the Shopping Cart.
    Then The user should be able to see Shopping Cart is empty

  @wip
  Scenario:  add product to shopping cart
    Then The user click on  the Computers
    And The user clicks on Notebooks icon and adds the product
    Then Verify that the product has been added to the shopping cart

  @wip
  Scenario: Number of items in the Shopping Cart
    And The user navigates to the Shopping Cart.
    Then The user should be able to see Shopping Cart
    Then The user click on  the Computers
    And The user clicks on Notebooks icon and adds the product
    And The user navigates to the Shopping Cart.
    And The user enters "7" product
    Then The user click on the update cart

