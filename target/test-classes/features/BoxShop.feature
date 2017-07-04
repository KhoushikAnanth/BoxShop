Feature: Box shop cart  tests
  As a customer I should be able to shop boxes on Kennards website

  @quantity
	Scenario: Change quantity of item before adding to cart
	Given I am on the Box Shop page
	When I change item quantity to "2" 
	Then I should see quantity to "2"
  

  @AddtoCart
	Scenario:Should only be able to add to cart once quantity is finalized.
	Given I am on the Box Shop page
	When I click on  ADD TO CART 
	Then I should see item in Cart
	
  @Saveaddeditem
    Scenario: Once Added item should remain in Cart till removed
    Given I am on the Box Shop page
    When I should be able to shop multiple products
    Then I should see all in Cart
    
  
    
  @RemoveItem
  	Scenario: I want to be able to remove a product from my cart.
  	Given I am on the Box Shop page
  	When I click on remove item
  	Then I should see the item been removed from cart
  
  @Atleastoneitem
  	Scenario: I should only be able to checkout only when at least one item in cart.
  	Given I am on the Box Shop page
  	When I click on CheckOut
  	Then I Checkout button should'nt be available.
  
  @DirectedtoDetailPage
  	Scenario: When I add all the products to cart i should be directed to Details page
  	Given I am on the Box Shop page
  	When I change item quantity to "10"
  	And I click on  ADD TO CART
  	When I click on CheckOut
  	Then I should be directed to DetailsPage  
  	
  	
  	
  	
   @Boundaryvalue
	Scenario: Any value other than 1 - 100000000 should be accepted
	Given I am on the Box Shop page
	When I change item quantity to "-1" 
	Then I should see not valid entry dialogue box

  @Discountrate
	Scenario: Value entered greater than should $5.10 per box
	Given I am on the Box Shop page
	When I change item quantity to "10" 
	Then I should see total price as "51"
	
	@TotalPriceofproducts
    Scenario: Once all items added Total should reflect in Cart
    Given I am on the Box Shop page
    When I add multiple product to the cart  
    Then I should see TotalPrice reflecting accordingly
  
  	