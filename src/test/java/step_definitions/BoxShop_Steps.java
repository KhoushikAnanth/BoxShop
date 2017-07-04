package step_definitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import pageobjects.BoxShop_PO;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BoxShop_Steps {
	public WebDriver driver;
	
	 public BoxShop_Steps()
	    {
	    	driver = Hooks.driver;
	    }
	 
	 
	@Given("^I am on the Box Shop page$")
	public void i_am_on_the_Box_Shop_page() throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
	    Assert.assertTrue(BoxShop_PO.validateBoxShopHome());
	}

	@When("^I change item quantity to \"(.*?)\"$")
	public void i_change_item_quantity_to(String quantity) throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
	    BoxShop_PO.setQuantity(Integer.parseInt(quantity));
	}
	
	@Then("^I should see quantity to \"(.*?)\"$")
	public void i_should_see_quantity_to(String expectedQuantity) throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
		String actualQuantity = BoxShop_PO.getQuantity();
		Assert.assertEquals("Comparing expected vs actual quantity:  ", actualQuantity, expectedQuantity);
	}
	@Then("^I should see not valid entry dialouge box$")
	public void i_should_see_not_valid_entry_dialouge_box() throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
		;
	}
	@Then("^I should see total price as \"(.*?)\"$")
	public void i_should_see_total_price_as(String arg1) throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
	    Assert.assertTrue(BoxShop_PO.validateTotalprice());
	}
	
	
	@When("^I click on  ADD TO CART$")
	public void i_click_on_ADD_TO_CART() throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
	    BoxShop_PO.clickAddToCart();
	}

	@Then("^I should see item in Cart$")
	public void i_should_see_item_in_Cart() throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
		int itemQuantity = Integer.parseInt(BoxShop_PO.getItemsInCart());
		Assert.assertTrue(itemQuantity > 0);
 }
	@When("^I add multiple product to the cart$")
	public void i_add_multiple_product_to_the_cart() throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
	    BoxShop_PO.clickAddToCart();
	    BoxShop_PO.addanotheritem();
	}

	@Then("^I should see TotalPrice reflecting accordingly$")
	public void i_should_see_TotalPrice_reflecting_accordingly() throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
	    Assert.assertTrue(BoxShop_PO.validateTotalprice());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	@When("^I click on remove item$")
	public void i_click_on_remove_item() throws Throwable {
		PageFactory.initElements(driver, BoxShop_PO.class);
	    BoxShop_PO.clickRemove();
	}

	@Then("^I should see the item been removed from cart$")
	public void i_should_see_the_item_been_removed_from_cart() throws Throwable {
	}
	@When("^I click on CheckOut$")
	public void i_click_on_CheckOut() throws Throwable {
	}

	@Then("^I Checkout button should'nt be available\\.$")
	public void i_Checkout_button_should_nt_be_available() throws Throwable {
	}
}

