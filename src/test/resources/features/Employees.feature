

Feature: Employees origin
  As a user, I want to be able to see the base city of all employees

  Background:
    Given user in the employees.html page

  Scenario: Selected only "Andrew" and verify display base cities
    When user clicks  checkbox in "Andrew" cell
    And user clicks  on the View selected data button
    Then user should be able to get origin "Andrew is from Tacoma"


  Scenario: Unselected an employee and verify display base cities
    When user clicks  on the View selected data button
    Then user should not be able to get origin