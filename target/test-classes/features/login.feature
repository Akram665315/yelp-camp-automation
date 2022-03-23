Feature: login

  Scenario: login with valid accounts
    Given user has a valid user account
    When he enters valid account
    Then verify user is logged in
