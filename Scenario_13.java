package amazon;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario_13 extends BaseClass{
@Test
	public void coupon() throws InterruptedException {
		     
    	
        
        WebElement d1=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
        Actions action=new Actions(driver);
        action.moveToElement(d1).perform();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("email")).sendKeys("9880101804");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Arjun@123");
        Thread.sleep(2000);
        driver.findElement(By.id("auth-signin-button")).click();
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
        driver.findElement(By.id("sc-buy-box-ptc-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("checkout-primary-continue-button-id"));
        Thread.sleep(3000);
       
        driver.findElement(By.name("ppw-instrumentRowSelection")).click();
        boolean paymentPage = driver.getCurrentUrl().contains("pay");
        Thread.sleep(2000);
        WebElement code=    driver.findElement(By.name("ppw-claimCode"));
        code.sendKeys("jAN10");
        driver.findElement(By.name("ppw-claimCodeApplyPressed")).click();
        List<WebElement> successMessages = driver.findElements(By.xpath("//*[contains(text(),'applied')]"));

        if(!successMessages.isEmpty() && successMessages.get(0).isDisplayed()) {
            System.out.println("Promo code applied successfully!");
        } else {
            System.out.println("Promo code not applied or invalid.");
        }
       

	}

}
