$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by High to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4514495500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchase",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details first name \"firstname\", last name \"lastname\" and zipPostalCode \"postcode\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \u0027THANK YOU FOR YOUR ORDER\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 115950300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "SearchFunctionalityTestSteps.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 221820300,
  "status": "passed"
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 106661900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "SearchFunctionalityTestSteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 125349300,
  "status": "passed"
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 113708700,
  "status": "passed"
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 145648800,
  "status": "passed"
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 99887000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstname",
      "offset": 28
    },
    {
      "val": "lastname",
      "offset": 51
    },
    {
      "val": "postcode",
      "offset": 80
    }
  ],
  "location": "SearchFunctionalityTestSteps.iEnterDetailsFirstNameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 262138000,
  "status": "passed"
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 84193000,
  "status": "passed"
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 64435200,
  "status": "passed"
});
formatter.match({
  "location": "SearchFunctionalityTestSteps.iShouldBeAbleToSeeMessageTHANKYOUFORYOURORDER()"
});
formatter.result({
  "duration": 49198700,
  "status": "passed"
});
formatter.after({
  "duration": 1106856200,
  "status": "passed"
});
});