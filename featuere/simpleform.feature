Feature: Simple Form Interaction

  Scenario: Submit a simple form
    Given I open the Simple Form page
    When I enter "10" in the first input field
    And I enter "5" in the second input field
    And I click the "Calculate" button
    Then the result should be "15"
