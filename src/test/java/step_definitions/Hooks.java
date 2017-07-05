package step_definitions;


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    public static WebDriver driver;

    
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public static WebDriver openBrowser() throws MalformedURLException {
    	System.out.println("Called openBrowser");
    	if(driver == null){
        	try {
        		driver = new ChromeDriver();
            	driver.manage().window().maximize();
            	driver.get("https://www.kss.com.au/boxshop");        		
        		
        		// start - IPHONE chrome browser
            	/*driver = new ChromeDriver();
            	driver.manage().window().setSize(new Dimension(375,627)); */
        		// end - IPHONE chrome browser
        		
        		// start - Samsung chrome browser
            	/*driver = new ChromeDriver();
            	driver.manage().window().setSize(new Dimension(360,640)); */
        		// end - Samsung chrome browser
            	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            	driver.manage().deleteAllCookies();
            	
        } finally{
        	Runtime.getRuntime().addShutdownHook(
				new Thread(new BrowserCleanup()));
        }
    	}
    	return driver;
    }

    private static class BrowserCleanup implements Runnable {
    	public void run() {
    		//LOGGER.info("Closing the browser");
    		try {
				close();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
    public static void close() throws MalformedURLException {
    	try {
    		openBrowser().quit();
    		driver = null;
    		//LOGGER.info("closing the browser");
    	} catch (UnreachableBrowserException e) {
    		//LOGGER.info("cannot close browser: unreachable browser");
    	}
    }
     
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
       driver.close();
        }
        
    }
    
}