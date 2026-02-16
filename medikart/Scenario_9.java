package medikart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Scenario_9{

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
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("span.menu-open-label")).click();
        Thread.sleep(3000);
        WebElement e3=   driver.findElement(By.xpath("//span[text()='DENTAL']"));
        Actions a1=new Actions(driver);
         a1.moveToElement(e3).perform();
         driver.findElement(By.xpath("//a[contains(text(),'Dental')]")).click();
               
Thread.sleep(3000);

         List<WebElement> products = driver.findElements(
                 By.cssSelector(".woocommerce-loop-product__title"));

         boolean allDental = true;

         for (WebElement product : products) {
             String name = product.getText().toLowerCase();

             if (!name.contains("dental")) {
                 allDental = false;
                 System.out.println(" Non-dental product found: " + product.getText());
                 break;
             }
         }

         if (allDental) {
             System.out.println("Only Dental products are displayed");
         } else {
             System.out.println("Dental category filter failed");
         }

         driver.quit();
     }
 
	}


