Feature: Below test cases are for sanity testing 
Scenario: Verify the application is logging with correct credentials..
Given Firefox Broser open
And  Browser should Maximize
And  Application url should enter and application should open
When User should be enter the valid username and password
And  Click on Login in button
And  User should wait for getting Screen shot
Then User should get Screen shot
#Then Broswser should closed


#Scenario: Verify that search button functionality..
#Given Firefox Broser open
#And  Browser should Maximize
#And  Application url should enter and application should open
#When User should be enter the valid username and password
#And  Click on Login in button
#And Click on Create claim button
#And User should click on from date cross button
#And click on Search button
#Then User should get Screen shot
#Then Broswser should closed


Scenario: Verify that search button functionality for Refering provider page..
Given Firefox Broser open
And  Browser should Maximize
And  Application url should enter and application should open
When User should be enter the valid username and password
And  Click on Login in button
And Click on Three line,Configuration,Refering provider button
And Enter Valid provider name
And click on Search button
Then User should get Screen shot


Scenario: Verify that  Edit screen is visible without any error .
Given Firefox Broser open
And  Browser should Maximize
And  Application url should enter and application should open
When User should be enter the valid username and password
And  Click on Login in button
And Click on Three line,Configuration,Refering provider button
And Enter Valid provider name
And click on Search button
And Click on Edit button
And Click on Speciality and taxonomity
#And Click on Cancel Button
Then User should get Screen shot
#-------------------------------


Scenario: Verify that search button functionality for Rendering provider page..
Given Firefox Broser open
And  Browser should Maximize
And  Application url should enter and application should open
When User should be enter the valid username and password
And  Click on Login in button
And Click on  line,Configuration,rendering provider button
And Enter Valid Rendering name
And click on RendSearch button
Then User should get Screen shot
#-------------------------------------------------------------------
Scenario: Verify that Edit button functionality for Rendering provider page..
Given Firefox Broser open
And  Browser should Maximize
And  Application url should enter and application should open
When User should be enter the valid username and password
And  Click on Login in button
And Click on  line,Configuration,rendering provider button
And Enter Valid Rendering name
And click on RendSearch button
And Click on RendEdit button
When Click on Speciality and taxonomy
Then User should get Screen shot
#-----------------------------------------------------------------------------
Scenario: Verify that search button functionality for Service Location page..
Given Firefox Broser open
And  Browser should Maximize
And  Application url should enter and application should open
When User should be enter the valid username and password
And  Click on Login in button
And Click on  line,Configuration,Service Location button
And Enter Valid Service Location name
And click on ServiceSearch button
Then User should get Screen shot
#-----------------------------------------------
Scenario: Verify that Edit button functionality for Service Location page..
Given Firefox Broser open
And  Browser should Maximize
And  Application url should enter and application should open
When User should be enter the valid username and password
And  Click on Login in button
And Click on  line,Configuration,Service Location button
And Enter Valid Service Location name
And click on ServiceSearch button
And Click on ServiceEdit button
Then User should get Screen shot
