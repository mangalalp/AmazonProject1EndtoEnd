package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario_14 extends BaseClass{
@Test
	public  void rating() throws InterruptedException {
		
        WebElement d1=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
        Actions action=new Actions(driver);
        action.moveToElement(d1).perform();
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("email")).sendKeys("9844663498");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Aryan@123");
        Thread.sleep(2000);
        driver.findElement(By.id("auth-signin-button")).click();
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Your Orders")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
        
        // Click Write a product review
        driver.findElement(By.xpath("//a[contains(text(),'Write a product review')]")).click();
        Thread.sleep(3000);

        
        WebElement starContainer = driver.findElement(
                By.xpath("//div[contains(@class,'in-context-ryp__form-field--starRating')]")
        );

        // Move mouse to extreme right (5th star) and click
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(starContainer, 120, 0).click().perform();

        System.out.println("5-star rating given successfully");
	}

}
