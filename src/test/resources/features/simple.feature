Feature: Shopping list

  Background: open application
    Given I check landing screen


  Scenario: Add shopping list
    When I click on add shopping list
    And I type "First List"
    And I click on add list
    Then I see "First List" on landing screen


  Scenario: Delete shopping list
    When I click on add shopping list
    And I type "First List 1"
    And I click on add list
    Then I see "First List 1" on landing screen
    When I click on "First List 1"
    And I click on option bar
    Then I click on delete list
    When I delete the list "First list"
    Then I check there is no "First list"