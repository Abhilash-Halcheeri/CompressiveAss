Feature: Search page

 Scenario: Searching Products
  Given User launch the chrome browser
   
   When user opens URL "https://www.urbanladder.com/"
    And Click on the search box and send text as "chair"
    And click on search button
  
  And close the button
Then close the browsers
   
