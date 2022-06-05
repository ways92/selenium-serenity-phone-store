Feature: Login feature
  User login use valid data and scenario

  Scenario: User login valid data
    Given User on login page
    When click log in on menu
    When User fill username and password
    When User click on login button to submit
    Then Validate on dashboard


  Scenario Outline: User login use scenario
    Given User on login page
    When click log in on menu
    When User enter username <username>
    When User enter password <password>
    When User click on login button to submit
    Then Validate on login page <result>

    Examples:
    |username      |password  |result|
#    |              |          |error |
#    |ways@gmail.com|          |error |
#    |              |makanayam |error |
#    |ways@gmail    |makanayam |not exist |
#    |ways@gmail.com|makan     |wrong pass |
    |ways@gmail.com|makanayam |dashboard |