Feature: LeafTaps create lead functionality

@functional
Scenario: To Create lead with mandatory information


When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter the Company name as 'Amazon'
And Enter the First Name as 'Jisha'
And Enter the Last Name as 'A'
When Click on Create Lead




