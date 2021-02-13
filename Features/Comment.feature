Feature: Comment 

Scenario: Verify commenting is enabled 
   Given User Launch Chrome browser 
	When User opens URL "https://www.bbc.co.uk/news/health-47742899#comp-comments-button" 
	Then user should be able to click on textarea 
	And close browser