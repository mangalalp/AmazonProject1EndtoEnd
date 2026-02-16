package medikart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sceanrio_15 {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://medikart.co.in/my-account/");
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		Thread.sleep(2000);
        e1.click();
        WebElement e5=     driver.findElement(By.id("username"));
        e5.sendKeys("mangalap2120@gmail.com");
        e5.click();
        WebElement e2 = driver.findElement(By.cssSelector("#login_whatsapp_phone"));
		e2.sendKeys("9880101804");
		e2.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#send_login_whatsapp_otp")).click();
		Thread.sleep(3000);
		System.out.println("Enter OTP manually...");
		Thread.sleep(15000); 
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript(
  "document.getElementById('login_whatsapp_otp')" +
  ".dispatchEvent(new Event('input'));"
);

driver.findElement(By.id("verify_login_otp")).click();	
        driver.navigate().refresh();
Thread.sleep(2000);
        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("your-name")).sendKeys("jaya");
   
        driver.findElement(By.name("your-email")).sendKeys("jaya123@gmail.com");

        driver.findElement(By.name("your-message")).sendKeys("This is a test query submitted using Selenium automation.");

        driver.findElement(By.cssSelector("input.wpcf7-submit")).click();
        
    }

	    }
	


	


