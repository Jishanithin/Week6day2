Feature: LeafTaps EditLead functionality
@regression
Scenario: To edit the created lead


When Click on 'Find Leads' link
Given Enter the FName as 'Jisha'
When Click on Find Leads 
When Click First Leads 
When Click on 'Edit' link
Given Enter the new Company name as 'HCL'
When Click on 'Update' button link
