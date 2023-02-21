 
Feature: Background functionality validation

@Scenario1 @Regression
Scenario: Sky Blue Background
Given     Set SkyBlue Background button exists
When      I click on the button
Then      the background color will change to sky blue    

@Scenario2 @Regression
Scenario: White Background Change
Given     Set SkyWhite Background button exists
When      I click on the white button
Then      the background color will change to white    
