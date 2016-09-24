Feature: Test that youtube works with cucumber

Background:
Given I am on youtube
@youtube
Scenario Outline: Go to category
When I click on <category>
Then I should see the <category> title
Examples:
|category|
|music|
|sports|