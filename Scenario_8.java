package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersLogic.class)
public class Scenario_8 extends BaseClass{
	@Test(retryAnalyzer=RetryLogicprogramm.class)
public void sort() throws InterruptedException

{
	    	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("Laptop"+Keys.ENTER);
			Thread.sleep(4000);
			 WebElement sort = driver.findElement(By.id("s-result-sort-select"));
			
		        Select s = new Select(sort);
		        
		        s.selectByVisibleText("Price: Low to High");
		        Thread.sleep(3000);

		        if (driver.findElements(By.id("s-result-sort-select_1")).size() > 0) {
		            System.out.println("Price Low to High sorting works");
		        } else {
		            System.out.println("Price Low to High sorting failed");
		        }

		     
		     WebElement sort2 = driver.findElement(By.id("s-result-sort-select"));
		     Select s2 = new Select(sort2);
		     s2.selectByVisibleText("Price: High to Low");
		     Thread.sleep(3000);

		     if (driver.findElements(By.id("s-result-sort-select_2")).size() > 0) {
		         System.out.println("Price High to Low sorting works");
		     } else {
		         System.out.println("Price High to Low sorting failed");
		     }

		    
		     WebElement sort3 = driver.findElement(By.id("s-result-sort-select"));
		     Select s3 = new Select(sort3);
		     s3.selectByVisibleText("Avg. Customer Review");
		     Thread.sleep(3000);

		     if (driver.findElements(By.id("s-result-sort-select_3")).size() > 0) {
		         System.out.println("Rating sorting works");
		     } else {
		         System.out.println("Rating sorting failed");
		     }

		     
	}
}
		

	



