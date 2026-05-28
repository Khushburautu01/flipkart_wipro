# Feature for validating Flipkart search functionality
Feature: Flipkart Search Functionality

Scenario Outline: Validate mobile search functionality

Given User launches the browser and opens Flipkart website
When User searches for "<mobile>"
Then User should navigate to the search results page

Examples:

| mobile   |
| iPhone 15 |
| Samsung   |
| Vivo      |