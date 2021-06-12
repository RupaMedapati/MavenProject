Feature: Login functionality of LeafTaps application
Scenario: TC001_Login with positive data
Given Open chrome browser
And Load the application url 'http://leaftaps.com/opentaps/control/main'
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on login button
Then Homepage should be displayed

  Scenario: TC001_Login with negative data
    Given Open chrome browser
    And Load the application url 'http://leaftaps.com/opentaps/control/main'
    And Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa123'
    When Click on login button
    But Error msg should be displayed
  
