Feature: CreateLead functionality of LeafTaps application
  Scenario: TC002_CreateLead with positive data
    And Click on CRM/SFA button

    And Click on createlead
    And Enter company name as 'infosys'
    And Enter firstname as 'pavani'
    And Enter lastname as 'sri'
    And Enter phonenumber '995674'
    When Click on submitbutton
    Then Display lead is created