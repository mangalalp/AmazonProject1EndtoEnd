package amazon;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scenario_6 extends BaseClass{
@Test(retryAnalyzer=RetryLogicprogramm.class)
public void pricefilter() throws InterruptedException
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
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Baby soap"+Keys.ENTER);
		Thread.sleep(4000);
	
		 Thread.sleep(5000);

	      
	        driver.findElement( By.xpath("//span[@class='a-price-whole' and contains(text(),'2,000')]")).click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        @Nullable
			Object price = null;
			js.executeScript("arguments[0].scrollIntoView(true);", price);
	        Thread.sleep(2000);

	        // Click using JavaScript (BEST WAY for Amazon)
	        js.executeScript("arguments[0].click();", price);

	        System.out.println("Price filter clicked successfully");

	        	Thread.sleep(5000);
	        	System.out.println("Price range filter applied");

	        Thread.sleep(5000);
	        System.out.println("Price range filter applied successfully");

	       
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,-500)");
	        Thread.sleep(3000);

	        List<WebElement> titles = driver.findElements(
	        	    By.cssSelector("span.a-size-base-plus, span.a-size-medium")
	        	);

	        	int count = 0;
	        	for (WebElement title : titles) {
	        	    if (title.getText().toLowerCase().contains("baby")) {
	        	        count++;
	        	    }
	        	}

	        	System.out.println("Products related to Baby: " + count);
	}
}

	


