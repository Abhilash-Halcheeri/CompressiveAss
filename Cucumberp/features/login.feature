Feature: Login
Scenario: Successfully login

Given User launch the chrome browser
When user opens URL "https://www.urbanladder.com/"
And click on profile
And click on sign in
And user enter  Email as"mahi1997halcheeri2@gmail.com" password as "123456"
And click on signup
Then Close the browser
  