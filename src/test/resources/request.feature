
Feature: Request functionality

  @getsingleuser
  Scenario: Get a single user
    Given user sends the request for single user
    Then user receives the response along with status code

  Scenario: Get all users
    Given user sends the request for all users
    Then user receives the response along with status code
