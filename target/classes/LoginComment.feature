Feature: Sign-in Validation 

Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://www.bbc.co.uk/" 
	And Click on Sign in icon 
	And User enters Email as "slygemk@gmail.com" and Password as "Bbc06bbc" 
	And Click on Sign in Button 
	Then Page Title should be "BBC - Home" 
	When User clicks on username icon 
	Then User clicks on sign out link 
	And close browser 
