Feature: We have user groups for easier and better management of our users

  Scenario Outline: Create new user group
    Given The user is on the Dashboard and logged in as Admin
    When he goes to the customer groups submenu
    And clicks on the add new button
    And he enters "<groupName>" as Group name
    And he enters "<description>" as Description of the group
    And he saves the new group
    Then ensures that "<modified_customer_group>" message is displayed
    Examples:
    | groupName | description  | modified_customer_group                        |
    | Test1     | For Deletion | Success: You have modified customer groups!\n× |
    | Test2     | Delete me!   | Success: You have modified customer groups!\n× |
    | Test3     | GL & HF      | Success: You have modified customer groups!\n× |


    Scenario: Delete Test user groups
      Given The user is on the Dashboard and logged in as Admin
      When he goes to the customer groups submenu
      And he sees Test groups, selects all of them
      And deletes them
      Then ensures there are no Test groups
