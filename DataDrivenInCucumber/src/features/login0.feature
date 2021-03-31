Feature: login0

# parameterizing using "scenario outline" and "examples" keywords through variables.
# we are passing data from "Examples" then to steps then to implementation methods.
# For every "Scenario outline" we have to define "Examples".
# we can use single data or multiple data at "Examples" keyword.

Scenario Outline: login with valid credentials

Given user should be at online shopping site "<url>"
And click on signIn button
When user enter valid "<emailOrPhoneNo>" and click on continue button
And user enter valid "<passWord>" and click on signIn button
Then user should be successfully login to the application

Examples:
          |url                  |emailOrPhoneNo|passWord|
          |https://www.amazon.in|7259318108    |a7259318108a|
          |https://www.amazon.in|7259318108    |a7259318108a|
          
          
Scenario Outline: Signout functionality

Given user should be at home page with "<SignInName>"
When click on signout button
Then user should get logout successfully and login page should display

Examples:
          |SignInName   |
          |Hello, Sujith|
