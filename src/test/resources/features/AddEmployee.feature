Feature: Add employee
  Scenario: User add employee
    Given User on page
    When User enter username and password
    When User click on login button to submit
    Then User see quick launch panel on dashboard
    When Click PIM on menu
    When Click Add Employee on submenu
    When Enter first name, middle name, last name, employee id
    When Click save
    Then User get new employee