Feature: Trainers
	As a training manager
	I want to see a list of my current trainers
	so that I can see what resources I have available.
	
Scenario: Story 1
	Given I am on the dashboard page
	When I press the trainer button
	Then i'm taking to the trainer view
	
Scenario: Story 2
	Given I am on the info page
	When I press the trainer button
	Then i'm taking to the trainer view
	
Scenario: Story 3
	Given I am on the trainer page
	When I press the trainer button
	Then I remain on the trainer view
	
Scenario: Story 4
	Given I am on any page
	When I press the trainer button
	Then I should initially see one trainer available


