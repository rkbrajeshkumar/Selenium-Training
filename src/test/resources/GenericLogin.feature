Feature: Validate the login functionality of Bharat Generic application

Scenario: validate login of valid username and invalid password
Given launch the chrome browser and maximize window
When launch the url of the bharat generic application
And provide the valid username in the email field
And provide the invalid password in the password field
And to click the login button
And Check whether it has navigate to home page or not
Then close the browser 

Scenario Outline: To validate the login credential with valid email and invalid password
Given user has to launch the chrome browser and maximize the window
When user has to launch the url of generic web application
And user has to enter the data "<emaildatas>" in email field
And user has to enter the data "<passworddates>"in password field
And click the login button
Then browser need to be closed

Examples:
|emaildatas								|passworddatas|
|rkbrajeshkumar						|12345				|
|abc@gmail.com						|abc123				|
|dfsdfr@live.com					|kijdf*5545		|
|rkbrajeshkumar@gmail.com	|abc@12345		|
|selenium@inmakes.com			|Cucumber@123	|