package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersLogic.class)

public class Scenario_4 extends BaseClass{
@Test(retryAnalyzer=RetryLogicprogramm.class)
	public void NameUpdate() throws InterruptedException
	{
	        WebElement d1=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
	        Actions action=new Actions(driver);
	        action.moveToElement(d1).perform();
	        driver.findElement(By.linkText("Sign in")).click();
	        driver.findElement(By.name("email")).sendKeys("9880101804");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("ap_password")).sendKeys("Arjun@123");
	        Thread.sleep(2000);
	        driver.findElement(By.id("auth-signin-button")).click();
	        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(accountList).perform();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Your Account")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//h2[contains(text(),'Login & security')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.id("NAME_BUTTON")).click();
	        Thread.sleep(2000);
	        WebElement nameupdate = driver.findElement(By.name("customerName"));
	        nameupdate.clear();
	        nameupdate.sendKeys("mangala");
	        Thread.sleep(2000);

	        driver.findElement(By.id("cnep_1C_submit_button")).click();
	        Thread.sleep(3000);
	        System.out.println(" Name updated successfully");
	       
	       
	        
	    }
	

	}




