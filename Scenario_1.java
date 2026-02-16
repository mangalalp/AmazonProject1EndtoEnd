package amazon;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersLogic.class)
public class Scenario_1 extends BaseClass{

	@Test(
		    timeOut = 60000, 
		    retryAnalyzer = RetryLogicprogramm.class
		)
		public void Tc1() throws InterruptedException
		{
		
		 
			
			  WebElement
			  d1=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"))
			  ; Actions action=new Actions(driver); action.moveToElement(d1).perform();
			  driver.findElement(By.linkText("Start here.")).click();
			  
			  WebElement
			  enterMobile=driver.findElement(By.xpath("//input[@name='email']"));
			  
			  enterMobile.sendKeys("mangalap2120@gmail.com");
			  
			  WebElement clickContinue=
			  driver.findElement(By.xpath("//input[@class='a-button-input']"));
			  clickContinue.click();
			 
       driver.navigate().refresh();
        WebElement proceed=   driver.findElement(By.xpath("//input[@class='a-button-input']"));
        
        if(proceed.isDisplayed() && proceed.isEnabled()) {
        	
        	proceed.click();
        }
     Thread.sleep(2000);
  
     WebElement phoneno= driver.findElement(By.id("ap_phone_number"));
     
     phoneno.sendKeys("9880101803");
     
     WebElement username= driver.findElement(By.name("customerName"));
     
     username.sendKeys("Jaya");
     Thread.sleep(2000);
     WebElement psword=  driver.findElement(By.name("password"));
     psword.sendKeys("Arjun@123");
     
     WebElement verify =driver.findElement(By.xpath("//input[@class='a-button-input']"));
     
     verify.click();
     
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("please enter OTP");
		 * String otp= sc.next();
		 */
     
     
		/*
		 * WebElement otps=driver.findElement(By.xpath("//input[@name='code']"));
		 * otps.sendKeys(otp);
		 */
     
     WebElement finalclick= driver.findElement(By.xpath("//span[@id='cvf-submit-otp-button']"));
	finalclick.click();
	
	
	
	}
	}



