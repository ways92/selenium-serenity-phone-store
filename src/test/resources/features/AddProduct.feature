Feature: Add product feature
  User add product to cart

  Scenario: User add Product
    Given User on login page
    When click log in on menu
    When User fill username and password
    When User click on login button to submit

    When Choose and click product on list
    When Click add to cart
    Then User see alert and click ok
    When Click cart on menu to navigate cart page
    Then Validate product on cart page