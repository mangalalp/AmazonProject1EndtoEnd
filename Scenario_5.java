package amazon;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersLogic.class)

public class Scenario_5 extends BaseClass{
@Test(retryAnalyzer=RetryLogicprogramm.class)
	public void searchproduct() throws InterruptedException
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
		e1.sendKeys("Toys"+Keys.ENTER);
		Thread.sleep(4000);
		List<WebElement> list=	driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		
if(	list.size()>0)
{
	 System.out.println("Search successful. Products found: " + list.size());
}
		

	}

}
