# Feature for validating Flipkart search functionality
Feature: Login Popup

Scenario Outline: Validate login popup

Given User launches the Flipkart website
When User clicks Login button
Then Login popup should appear

Examples:

| TestData |
| Login    |