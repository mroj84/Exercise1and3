Feature: Search

  @regression
  Scenario: Search product scenario with firefox
    Given I open firefoxbrowser
    Given I am an existing customer
    When I login as existing customer
    And I search for product "Printed Chiffon Dress"
    Then I see product "Printed Chiffon Dress" on listning page

  @regression
  Scenario: Search product scenario with chrome
    Given I open chromebrowser
    Given I am an existing customer
    When I login as existing customer
    And I search for product "Printed Chiffon Dress"
    Then I see product "Printed Chiffon Dress" on listning page
