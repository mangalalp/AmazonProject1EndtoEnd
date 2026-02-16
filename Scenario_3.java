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

public class Scenario_3 extends BaseClass{
@Test(retryAnalyzer=RetryLogicprogramm.class)

	public void Logininvalidpassword() throws InterruptedException
	{
	        WebElement d1=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
	        Actions action=new Actions(driver);
	        action.moveToElement(d1).perform();
	        driver.findElement(By.linkText("Sign in")).click();
	        driver.findElement(By.name("email")).sendKeys("9880101804");
	        driver.findElement(By.id("continue")).click();
	        driver.findElement(By.id("ap_password")).sendKeys("Aryan@123");
	        Thread.sleep(2000);
	        driver.findElement(By.id("auth-signin-button")).click();

	}

}
