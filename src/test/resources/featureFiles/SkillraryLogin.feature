#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Skillrary demo app login

  Background: 
    Given Enter to login page

  Scenario: Login to skillrary demo app with valid credentials
    When when i provide valid credentials
    And hit on login
    Then I should navigate to Homepage

  Scenario Outline: Login to Skillrary with multiple credentials
    When when i provide <username> and <password>
    And hit on login
    Then I should navigate to Homepage

    Examples: 
      | username | password |
      | admin    | admin    |
      | user     | user     |
      | abcdefg  |   123456 |