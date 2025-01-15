Feature: Mark Interview and Offer

  Scenario: Successfully mark interview and offer
    Given the user is on the Mark Interview and Offer page
    When the user clicks the mark offer button
    And the user clicks the save button
    And the user clicks the offer job button
    And the user clicks the save button
    Then the interview should be marked as offered
