Feature: Comment 

Scenario: Verify commenting is enabled 
   Given User Launch Chrome browser 
	When User opens URL "https://www.bbc.co.uk/news/health-47742899#comp-comments-button" 
	Then user should not be able to click on textarea if not enabled 
	And close browser