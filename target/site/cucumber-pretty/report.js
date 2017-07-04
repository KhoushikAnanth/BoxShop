$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BoxShop.feature");
formatter.feature({
  "line": 1,
  "name": "Box shop cart  tests",
  "description": "As a customer I should be able to shop boxes on Kennards website",
  "id": "box-shop-cart--tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14872440316,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "I should only be able to checkout only when at least one item in cart.",
  "description": "",
  "id": "box-shop-cart--tests;i-should-only-be-able-to-checkout-only-when-at-least-one-item-in-cart.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Atleastoneitem"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I am on the Box Shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "I click on CheckOut",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "I Checkout button should\u0027nt be available.",
  "keyword": "Then "
});
formatter.match({
  "location": "BoxShop_Steps.i_am_on_the_Box_Shop_page()"
});
formatter.result({
  "duration": 262234082,
  "status": "passed"
});
formatter.match({
  "location": "BoxShop_Steps.i_click_on_CheckOut()"
});
formatter.result({
  "duration": 121736428,
  "status": "passed"
});
formatter.match({
  "location": "BoxShop_Steps.i_Checkout_button_should_nt_be_available()"
});
formatter.result({
  "duration": 29079,
  "status": "passed"
});
formatter.after({
  "duration": 128860,
  "status": "passed"
});
});