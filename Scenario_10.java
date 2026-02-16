package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Scenario_10 extends BaseClass {
@Test
	public void cartupdate() throws InterruptedException {
		

	        // Open Amazon
	       
	        Thread.sleep(3000);
            driver.navigate().refresh();
	        // Search for phone
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys("mobile phone");
	        searchBox.sendKeys(Keys.ENTER);
	        Thread.sleep(4000);

	        // Click first product
	        WebElement firstProduct = driver.findElement(By.xpath("(//a[contains(@class,'s-no-outline')])[1]"));
	        		firstProduct.click();
	        Thread.sleep(4000);

	        // Switch to new tab
	        for (String tab : driver.getWindowHandles()) {
	            driver.switchTo().window(tab);
	        }
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,600)");

	        // Add to cart
	        Thread.sleep(3000);
			WebElement AddToCart = driver.findElement(By.xpath("(//div[@id='addToCart_feature_div'])[3]"));
			AddToCart.click();

	        // Go to cart
	        driver.findElement(By.id("nav-cart-count")).click();
	        Thread.sleep(3000);

	        // Update quantity to 2
	        WebElement quantityDropdown = driver.findElement(
	                By.xpath("//span[@class='a-icon a-icon-small-add']"));
	        quantityDropdown.click();
	        Thread.sleep(3000);

	        // Remove item from cart
	        WebElement deleteItem = driver.findElement(
	                By.xpath("//input[@value='Delete']"));
	        deleteItem.click();
	        Thread.sleep(3000);

	       
	    }
	}

	


