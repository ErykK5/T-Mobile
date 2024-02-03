Feature: Choose phone number from offer list

  Scenario: Simple select scenario
    Given page 'https://www.t-mobile.pl/' is loaded
    When 'Urządzenia' > 'Smartwatche i opaski' > 'Bez abonamentu' is selected
    And the first product is added to shopping cart
    And user is redirected to main view
    Then the shopping cart with 1 product is available on the main page