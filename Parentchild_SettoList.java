package amazon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Parentchild_SettoList {
	@Test
	
		
		public void method1() throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			// driver.manage().window().maximize();
			//driver.manage().window().setPosition(new Point(1200, 0));
			driver.manage().window().maximize();

			driver.get("https://www.amazon.in/");

			driver.manage().window().maximize();

			Thread.sleep(2000);
			WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
			Thread.sleep(2000);

			// e1.click();
			e1.sendKeys("Shoes");
			Thread.sleep(2000);
			e1.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			List<WebElement> list = driver
					.findElements(By.xpath("//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal']"));

			int count = list.size();
			System.out.println("no of items on page : " + count);

			// list.get(count - 6).click();
			for (int i = 0; i <= 4; i++) {
				Thread.sleep(1000);
				list.get(count - (count - i)).click();
			}

			Set<String> browserIds = driver.getWindowHandles();
			System.out.println(browserIds);
		
			List<String> browserIdList = new ArrayList<>(browserIds);

			for (int i = 1; i < browserIdList.size(); i++)
			{
				String childId = browserIdList.get(i);
			    System.out.println("Child ID_" + i + ": " + childId);

			    driver.switchTo().window(childId);
			    Thread.sleep(2000);
			    String title=driver.getTitle();
			    System.out.println(title);
			}

		/*	WebElement productTitle = driver.findElement(By.id("productTitle"));
			if (productTitle.isDisplayed()) {
				System.out.println("productTitle is Displayed ");
			} else {
				System.out.println("productTitle is NOT Displayed ");
			}

			WebElement sellingPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));

			if (sellingPrice.isDisplayed()) {
				System.out.println("sellingPrice is Displayed ");
			} else {
				System.out.println("sellingPrice is NOT Displayed ");
			}

			WebElement sellingPrice_1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
			if (sellingPrice_1.isDisplayed()) {
				System.out.println("sellingPrice_1 is Displayed ");
			} else {
				System.out.println("sellingPrice_1 is NOT Displayed ");
			}

			WebElement addTocartBtn = driver.findElement(By.id("add-to-cart-button"));
			WebElement buyNowBtn = driver.findElement(By.id("buy-now-button"));
			if (addTocartBtn.isDisplayed() && buyNowBtn.isDisplayed()) {
				System.out.println("addTocartBtn & buyNowBtn is Displayed ");
			} else {
				System.out.println("addTocartBtn & buyNowBtn is NOT Displayed ");
			}
			//driver.quit();
		*/
		}

	}