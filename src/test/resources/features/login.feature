Feature: Login

  Scenario: Successful Login
    Given User is on HomePage
    When User click on Login icon
    #Then User verifies Login form is displayed
  And User enters valid data
    And User clicks on Anmelden button
    And User clicks on User icon
Then User verifies his name

