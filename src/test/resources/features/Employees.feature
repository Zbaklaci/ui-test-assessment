
@wip
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


  Scenario Outline: Selected an employee with first name and verify base city is displayed
    When user clicks dropDown icon in Steven cell
    And user clicks  checkbox in "<Name>" cell
    And user clicks  on the View selected data button
    Then user should be able to get origin "<city of employee message>"
    Examples:
      | Name | city of employee message |
      | Andrew     | Andrew is from Tacoma    |
      | Nancy      | Nancy is from Seattle    |
      | Janet      | Janet is from Kirkland   |
      | Margaret   | Margaret is from Redmond |
      | Steven     | Steven is from London    |
      | Michael    | Michael is from London   |
      | Robert     | Robert is from London    |
      | Anne       | Anne is from London      |
      | Laura      | Laura is from Seattle    |

  Scenario: Select all employees and verify base cities are displayed
    And user clicks following employees checkboxes
      | Andrew     |
      | Nancy      |
      | Janet      |
      | Margaret   |
      | Steven     |
      | Michael    |
      | Robert     |
      | Anne       |
      | Laura      |
    And user clicks  on the View selected data button
    Then all the employee origins should match following data
      | Andrew is from Tacoma    |
      | Nancy is from Seattle    |
      | Janet is from Kirkland   |
      | Margaret is from Redmond |
      | Steven is from London    |
      | Michael is from London   |
      | Robert is from London    |
      | Anne is from London      |
      | Laura is from Seattle    |

