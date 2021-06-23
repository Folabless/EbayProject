Feature: Search


  Scenario Outline: User can search for an Apple iPhone
    Given I navigate to Ebay homepage
    When I enter the phone name as "Apple iPhone"
    And I select the storage capacity as "64GB"
    And I select condition as "New"
    And I select grade as "A"
    And I select quantity as "1"
    And I click on search button
    Then search result page is displayed

    Examples: Search Test Data
    |Phone name  |Storage capacity|Condition|Grade|Quantity|
    |Apple iPhone| 64GB           |New      |A    |1       |
    |Smartphone  | 64GB           |New      |A    |1       |
    |Blackberry  | 64GB           |New      |A    |1       |