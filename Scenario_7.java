package amazon;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersLogic.class)
public class Scenario_7 extends BaseClass{
@Test(retryAnalyzer=RetryLogicprogramm.class)
	public void prductdescription()
	{
	        // Search product
	        driver.findElement(By.id("twotabsearchtextbox"))
	              .sendKeys("Mobile", Keys.ENTER);

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,800)");

	        // Get products
	        List<WebElement> products = driver.findElements(
	            By.xpath("//a[@class='a-link-normal s-no-outline']")
	        );

	        System.out.println("Products found: " + products.size());

	        // Click first product
	        if (products.size() > 0) {
	            js.executeScript("arguments[0].click();", products.get(0));
	        }

	        // Switch window
	        String parent = driver.getWindowHandle();
	        for (String win : driver.getWindowHandles()) {
	            if (!win.equals(parent)) {
	                driver.switchTo().window(win);
	            }
	        }

	      

	        // PRICE
	        WebElement price = driver.findElement(
	            By.xpath("//span[@class='a-price-whole']")
	        );
	        System.out.println("Price displayed: " + price.isDisplayed());

	       
	            WebElement reviews = driver.findElement(
	                By.xpath("//span[contains(@id,'acrCustomerReviewText')]")
	            );
	            System.out.println("Reviews displayed: " + reviews.isDisplayed());

	            // DESCRIPTION
	            WebElement description = driver.findElement(
	                By.id("title_feature_div")
	            );
	            System.out.println("Description displayed: " + description.isDisplayed());

	            
	        }
	    

	}

	    

	      










	

	
