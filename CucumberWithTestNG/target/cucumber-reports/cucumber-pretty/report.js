$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Work_Space_3/CucumberWithTestNG/src/features/login1.feature");
formatter.feature({
  "name": "login1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sign in with valid credentials successfuly and sign out successfuly",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be at online shopping site",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInTestUsingDataTable.user_should_be_at_online_shopping_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sign in with valid credentials and sign out from account",
  "rows": [
    {
      "cells": [
        "emailOrPhoneNo",
        "passWord",
        "SignInName"
      ]
    },
    {
      "cells": [
        "7259318108",
        "a7259318108a",
        "Hello, Sujith"
      ]
    },
    {
      "cells": [
        "7259318108",
        "a7259318108a",
        "Hello, Sujith"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "SignInTestUsingDataTable.user_sign_in_with_valid_credentials_and_sign_out_from_account(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get logout successfully and login page should display successfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTestUsingDataTable.user_should_get_logout_successfully_and_login_page_should_display_successfuly()"
});
formatter.result({
  "status": "passed"
});
});