@System
Feature: f3
 
 @smoke
  Scenario: s1

  @smoke @sanity
  Scenario: s2

  @smoke @regression
  Scenario: s3

  @smoke @sanity @regression
  Scenario: s4

  @sanity
  Scenario: s5

  @regression
  Scenario: s6

  @sanity @regression
  Scenario: s7