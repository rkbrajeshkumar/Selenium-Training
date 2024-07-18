Feature: To validate the login functionality of Facebook application

Background:
Given To launch the chrome browser and maximize window

Scenario:	To validate login of valid username and invalid password
When To launch the url of facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to home page or not
Then To close the browser


Scenario Outline: To validate the positive and negative combination of facebook login functionality
When User has to launch the url of facebook application
And User has to pass data "<emaildatas>" in email field
And User has to pass data "<passworddata>" in password field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildatas								|passworddatas|
|rkbrajeshkumar						|12345				|
|abc@gmail.com						|abc123				|
|dfsdfr@live.com					|kijdf*5545		|
|rkbrajeshkumar@yahoo.com	|abc@12345		|
|selenium@inmakes.com			|Cucumber@123	|
