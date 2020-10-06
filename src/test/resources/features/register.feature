Feature: Register

  @regression
  Scenario: Successful register scenario with firefox
    Given I open firefoxbrowser
    Given I am a new customer
    When I navigate to registration form
    And I fullfill registration form
    And I click register button
    Then I am logged in

  @regression
  Scenario: Successful register scenario with chrome
    Given I open chromebrowser
    Given I am a new customer
    When I navigate to registration form
    And I fullfill registration form
    And I click register button
    Then I am logged in
