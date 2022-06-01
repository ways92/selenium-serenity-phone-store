Feature: User login
  Scenario: User login valid data
    Given User on login page
    When click log in on menu
    When User enter username and password
    When User click on login button to submit
    Then Validate on dashboard
