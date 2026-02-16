package amazon;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Scenario_9  extends BaseClass{
	@Test(retryAnalyzer=RetryLogicprogramm.class)
	public  void cart() throws InterruptedException {
		

		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(6000);

		// Search product
		WebElement shoes = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		shoes.sendKeys("Mobile iphone" + Keys.ENTER);

		Thread.sleep(6000);

		WebElement iPhone_15 = driver.findElement(By.xpath("//h2[@aria-label='iPhone 15 (128 GB) - Black']"));
		iPhone_15.click();

		/// Changing window so moven pWindo to cWindow

		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);

		Iterator<String> itr = ids.iterator();
		String Parent_window = itr.next();
		System.out.println(Parent_window); // parent windo id
		String Child_window = itr.next();
		System.out.println(Child_window); // Child windo id

		driver.switchTo().window(Child_window);

		Thread.sleep(3000);
		WebElement AddToCart = driver.findElement(By.xpath("(//div[@id='addToCart_feature_div'])[3]"));
		AddToCart.click();

		WebElement textAddToCart = driver
				.findElement(By.xpath("//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));

		if (textAddToCart.isDisplayed() == true) {

			System.out.println("Item added successfully");
		} else {
			System.out.println();

			System.out.println("Item Not added ");
		}
		
	}	
}
	
	



