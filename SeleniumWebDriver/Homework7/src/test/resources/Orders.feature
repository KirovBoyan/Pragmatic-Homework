Feature: The orders page has many options that can be changed,
  so we need to test them

  Scenario: Change Currency to Euro
    Given The user is on the Orders page and logged in as Admin
    When he tries to edit the order
    And changes the currency to: Euro
    And continues and saves the changes
    Then ensures that the order's new currency is Euro

  Scenario: Change Order status to Complete
    Given The user is on the Orders page and logged in as Admin
    When he changes the Order status to complete
    And saves the changes
    Then ensures that the order's new status is Complete

  Scenario: Change Order status to Denied and provide a reason
    Given The user is on the Orders page and logged in as Admin
    When he changes the Order status to Denied
    And Provides a reason for it
    And Notifies the customer for it
    And saves the changes
    Then ensures the the orders is denied and a reason is provided
