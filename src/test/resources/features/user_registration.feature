Feature: user registration

  Scenario: Create a user registration
    Given user is on registration page
    When user registers with valid data
    Then his account is created successfully