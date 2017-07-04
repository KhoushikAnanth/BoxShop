$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BoxShop.feature");
formatter.feature({
  "line": 1,
  "name": "Box shop cart  tests",
  "description": "As a customer I should be able to shop boxes on Kennards website",
  "id": "box-shop-cart--tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15410718257,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "When I add all the products to cart i should be directed to Details page",
  "description": "",
  "id": "box-shop-cart--tests;when-i-add-all-the-products-to-cart-i-should-be-directed-to-details-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@DirectedtoDetailPage"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I am on the Box Shop page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "I change item quantity to \"10\"",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I click on  ADD TO CART",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on CheckOut",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I should be directed to DetailsPage",
  "keyword": "Then "
});
formatter.match({
  "location": "BoxShop_Steps.i_am_on_the_Box_Shop_page()"
});
formatter.result({
  "duration": 308521350,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 27
    }
  ],
  "location": "BoxShop_Steps.i_change_item_quantity_to(String)"
});
formatter.result({
  "duration": 220133650,
  "status": "passed"
});
formatter.match({
  "location": "BoxShop_Steps.i_click_on_ADD_TO_CART()"
});
formatter.result({
  "duration": 147199557,
  "status": "passed"
});
formatter.match({
  "location": "BoxShop_Steps.i_click_on_CheckOut()"
});
formatter.result({
  "duration": 84625077,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 131712,
  "status": "passed"
});
});