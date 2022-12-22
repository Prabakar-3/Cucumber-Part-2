Feature: To validate the login functionality in Gmail Application

Scenario Outline: To validate the positive and negative combination of login functionality

Given To launch the chrome browser and maximize the window
When To launch the url of gmail application
And To pass the email data "<emaildata>" in email field
And To click the next button under email field
And To pass the password data "<passworddata>" in password field
And To click the next button under password field
Then To close the Browser


Examples:

|emaildata         		|passworddata|
|sankara@gmail.com 		|123422|
|selenium@gmail.com		|kjisjs|
|manualtesting.com 		|selenium|
|inmakes@gmail.com		|inmakes|