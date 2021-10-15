Feature: LeafTaps MergeLead functionality


@smoke
Scenario: To Create lead with mandatory information

When Click on 'Merge Leads' link
Then 'Merge Leads' page should be displayed
When Click on From Lead icon
Then 'Find Leads' page should be displayed
When Click on From Lead icon
When Click on First Lead ID
When Click on To Lead icon
When Click on Second Lead ID
When Click on 'Merge' link
When Click on ok button
