Feature: Test that yahoo works with cucumber

Background:
Given I am on yahoo

@yahoo
Scenario Outline: Search for coffee
When I type <Input>
And I click search
Then I should see the <Input> SERP
Examples:
|Input|
|coffee|
|pizza|
|sushi|