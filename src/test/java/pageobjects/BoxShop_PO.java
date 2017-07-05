package pageobjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoxShop_PO extends BaseClass{

	public BoxShop_PO(WebDriver driver){
		super(driver);
	}    

	
	@FindBy(how=How.ID, using="boxit")
	public static WebElement boxshopHome;
	public static WebElement boxittab;
	public static WebElement validateTotalprice;
	
	@FindBy(how=How.XPATH, using="boxit")
	public static WebElement validateIteminCart;
	
	public static WebElement validateQuantity;
	
	@FindBy(how=How.ID, using="home-model-select")
	public static WebElement carModel;
	
	@FindBy(how=How.XPATH, using="//form[@id='desktop-search-form']//span[@id='select2-home-model-select-container']")
	public static WebElement carModelContainer;
	
	@FindBy(how=How.XPATH, using="//form/div[3]/input[@id='desktop-location']")
	public static WebElement location;
	
	@FindBy(how=How.XPATH, using="//form[@id='desktop-search-form']/input")
	public static WebElement getStartedButton;
	
	@FindBy(how=How.ID, using="desktop-phone-number")
	public static WebElement getPhoneNumber;
	
	public static boolean validateBoxShopHome() {
		(new WebDriverWait(driver, 30))
	  			  .until(ExpectedConditions.presenceOfElementLocated(By.id("main-wrapper")));
	  	return boxshopHome.isDisplayed();
	}
/*	public static boolean validateboxittab(){
		
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='main-shop-input quantity'][1]")));
return boxittab.isDisplayed();
	}*/
	public static void setQuantity(int quantity){
		
		WebElement element = driver.findElement(By.xpath("//input[@class='main-shop-input quantity'][1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		element.sendKeys("2");
		element.sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//input[@class='main-shop-input quantity'][1]")).sendKeys("2");
		//driver.fin
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		 // js.executeScript("document.getElementsByClassName('main-shop-input quantity')[1].setAttribute('value', '6')");
	}
	public static String getQuantity(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='main-shop-input quantity'][1]")));
		waitForJSandJQueryToLoad();
	return driver.findElement(By.xpath("//input[@class='main-shop-input quantity'][1]")).getAttribute("value");
	}
	
	
	public static boolean validateTotalprice(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[class='ui-button-text']")));
	return validateTotalprice.isDisplayed();
	
	}
	
	
	public static void clickAddToCart(){
		waitForJSandJQueryToLoad();
		WebElement element = driver.findElement(By.xpath("//a[@class='btn main-shop-submit'][1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
	}
	public static String getItemsInCart(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='incart-item-list']")));
		  List <WebElement> elements = driver.findElements(By.cssSelector("p.incart-item"));
		  waitForJSandJQueryToLoad();
		  System.out.println("elements size is " + elements.size());
		return Integer.toString(elements.size());
		
	}
	
	public static void addanotheritem(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='list-item'][2]")));
		  waitForJSandJQueryToLoad();
		 driver.findElement(By.xpath("//div[@class='list-item'][2]/div/table/tbody/tr/td[3]/a[@class='btn main-shop-submit']")).click();
	}
	public static void clickRemove() throws InterruptedException{
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='remove-item']")));
		WebElement element = driver.findElement(By.xpath("//a[@class='remove-item']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
	}
	
	/**
	 * Click Checkout button
	 */
	public static void clickCheckout(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[class='incart-item']")));
		WebElement element = driver.findElement(By.xpath("//a[@class='btn btn-block btn-lg action-checkout'][1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//click on checkout button on cart page
		executor.executeScript("arguments[0].click();", element);
		
		
	}
	
	public static boolean waitForJSandJQueryToLoad() {

	    WebDriverWait wait = new WebDriverWait(driver, 30);

	    // wait for jQuery to load
	    ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
	      public Boolean apply(WebDriver driver) {
	        try {
	          return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
	        }
	        catch (Exception e) {
	          // no jQuery present
	          return true;
	        }
	      }
	    };

	    // wait for Javascript to load
	    ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
	      public Boolean apply(WebDriver driver) {
	        return ((JavascriptExecutor)driver).executeScript("return document.readyState")
	        .toString().equals("complete");
	      }
	    };

	  return wait.until(jQueryLoad) && wait.until(jsLoad);
	}

}
	
 


	
	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
