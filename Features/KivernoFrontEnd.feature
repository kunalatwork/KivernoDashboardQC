Feature: Kiverno Front End


Scenario: All fields of Kiverno Dashboard of Non-Manager
Given User Launch browser and Enter url
Then User enter username and password
And Click on loginSubmit button
Then Select model and brands
Then User open calendar and open date
And click on reset button
Then Click on Score History
Then User checks score history of Self Review and according dates
And Clicks on Download PDF button of self Review
Then Checks Score history of independent internal and according dates
And  Clicks on Download PDF button of independent internal
Then Checks Score history of External internal and according dates
And Clicks on Download PDF button of External internal
Then Clicks on Form Records
And Clicks on Excel button
Then User clicks on Report button from Non-Manager
And Select values from filter and generate report
And Click on compare and compare data with other clients
Then User comes on home and Logout


Scenario: All fields of Kiverno Dashboard of Manager
Given User Launch browser and Enter url on Manager Dashboard
Then User enter username and password on Manager Dashboard
And Click on Submit button
Then Select model and brands on Managder Dashboard
And Select individual(Non-manager) and method
Then User open calendar and open date of Manager Dashboard
And click on reset button of Manager Dashboard
Then Click on Score History of Manager Dashboard
And Select Model and Individual(Non-manager)
Then User checks score history of Self Review and according dates of Manager Dashboard
And Clicks on Download PDF button of self Review of Manager Dashboard
Then Checks Score history of independent internal and according dates of Manager Dashboard
And  Clicks on Download PDF button of independent internal of Manager Dashboard
Then Checks Score history of External internal and according dates of Manager Dashboard
And Clicks on Download PDF button of External internal of Manager Dashboard
Then Clicks on Form Records of Manager Dashboard
And Clicks on Excel button of Manager Dashboard
Then User clicks on Report button of Manager Dashboard
And Select Development and check report
Then Select Charts and check graphs according Elements
Then User fill details in filter and generate graph
And User click on comparator and choose required fileds
And Generate Reports 
Then User comes on home and Logout from Manager Dashboard
