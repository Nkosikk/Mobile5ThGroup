@RegressionDev @APIDemos
Feature: API Demos
  Scenario: Verify that API demos landing page is displayed
    Given The app is launched
    And User verify that the landing is displayed
#    And User click App

  Scenario: setup one shot alarm
    Given The app is launched
    And User verify that the landing is displayed
    And User click App
    And User click alarm
    And user click alarm controller
    When user click one shot alarm
    Then the confirmation message is displayed
