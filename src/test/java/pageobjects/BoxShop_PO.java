package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
		
		driver.findElement(By.xpath("//input[@class='main-shop-input quantity'][1]")).sendKeys("2");
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		 // js.executeScript("document.getElementsByClassName('main-shop-input quantity')[1].setAttribute('value', '6')");
	}
	public static String getQuantity(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[class='ui-button-text']")));
	return driver.findElement(By.xpath("//input[@class='main-shop-input quantity'][1]")).getAttribute("value");
	}
	
	
	public static boolean validateTotalprice(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[class='ui-button-text']")));
	return validateTotalprice.isDisplayed();
	
	}
	
	
	public static void clickAddToCart(){
		WebElement element = driver.findElement(By.xpath("//a[@class='btn main-shop-submit'][1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
	}
	public static String getItemsInCart(){
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[class='incart-item-list']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return (String) js.executeScript("document.getElementsByClassName('incart-item')");
	}
	
	public static void addanotheritem(){
	WebElement element = driver.findElement(By.xpath("//a[@class='btn main-shop-submit'][1]"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", element);
	
	}
	public static void clickRemove(){
		WebElement element = driver.findElement(By.xpath("//a[@class='btn main-shop-submit'][1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	/**
	 * Click Checkout button
	 */
	public static void clickCheckout(){
		WebElement element = driver.findElement(By.xpath("//a[@class='btn main-shop-submit'][1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
	}

}
	
 


	
	
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
