# Feature for validating Flipkart search functionality
Feature: Scroll Functionality

Scenario Outline: Validate page scrolling

Given User launches the browser and opens Flipkart website
When User scrolls down the page
Then Page should scroll successfully

Examples:

| ScrollData |
| ScrollTest |