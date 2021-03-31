Feature: login1

# parameterizing using "Data Table" concept.
# we are passing data from "table table". Then we are using Maps in step definition to use multiple test data.
# data table - we can define test data(single or multiple data) for every step of feature file.
# scenario outline and examples keywords should not be used.

Scenario: Sign in with valid credentials successfuly and sign out successfuly

Given user should be at online shopping site
When user sign in with valid credentials and sign out from account
          |emailOrPhoneNo|passWord    |SignInName   |
          |7259318108    |a7259318108a|Hello, Sujith|
          |7259318108    |a7259318108a|Hello, Sujith|
Then user should get logout successfully and login page should display successfuly