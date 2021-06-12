Feature: Login functionality of LeafTaps application
  Background:
    Given Open chrome browser
    And Load the application url 'http://leaftaps.com/opentaps/control/main'

  Scenario Outline: TC001_Login with positive data

    Given Enter the username as <username>
    And Enter the password as <password>
    When Click on login button
    Then Homepage should be displayed
Examples:
    |username|password|
    |'Demosalesmanager'|'crmsfa'|
    |'DemoCSR'         |'crmsfa'|
  Scenario: TC001_Login with negative data

    Given Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa123'
    When Click on login button
    But Error msg should be displayed