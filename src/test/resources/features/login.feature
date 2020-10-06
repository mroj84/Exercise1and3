Feature: Login

  @regression
  Scenario: Successful login scenario with firefox
    Given I open firefoxbrowser
    Given I am an existing customer
    When I login as existing customer
    Then I am logged in

  @regression
  Scenario: Successful login scenario with chrome
    Given I open chromebrowser
    Given I am an existing customer
    When I login as existing customer
    Then I am logged in
