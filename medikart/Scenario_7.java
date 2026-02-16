package medikart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Scenario_7 {

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
        Thread.sleep(3000);
        WebElement s1 = driver.findElement(By.name("s"));
        s1.sendKeys("pulse oximeter");
        Thread.sleep(4000);
        List<WebElement> list= driver.findElements(By.xpath("//div[@class='wd-scroll-content']/div/div"));
        int count =list.size();
        if(list.size()>0) {
        	list.get(0).click();
        	 driver.findElement(By.id("wd-add-to-cart")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//a[contains(@href,'cart')]")).click();
             Thread.sleep(4000);
             driver.findElement(By.linkText("Proceed to checkout")).click();
             Thread.sleep(3000);
             driver.findElement(By.cssSelector("#billing_first_name")).sendKeys("Mangala");
             driver.findElement(By.cssSelector("#billing_last_name")).sendKeys("Patil");
             driver.findElement(By.cssSelector("#billing_company")).sendKeys("HP");
             driver.findElement(By.cssSelector("#billing_country"));
             driver.findElement(By.cssSelector("#billing_address_1")).sendKeys("Begur #303");
             driver.findElement(By.cssSelector("#billing_address_2")).sendKeys("Splendid Lake breeze");
             driver.findElement(By.cssSelector("#billing_city")).sendKeys("Bangalore");
             driver.findElement(By.id("select2-billing_state-container")).click();
             Thread.sleep(2000);
             WebElement stateInput = driver.findElement(
                     By.cssSelector("input.select2-search__field"));

             stateInput.sendKeys("Karnataka");
             stateInput.sendKeys(Keys.ENTER);
             driver.findElement(By.cssSelector("#billing_postcode")).sendKeys("580068");
             Thread.sleep(2000);
             driver.findElement(By.id("billing_phone")).sendKeys("9865324585");
             driver.findElement(By.id("billing_email")).sendKeys("Test123@gmail.com");
           //  System.out.println("Checkout mock completed successfully (no payment).");
             Thread.sleep(2000);
             driver.findElement(By.cssSelector("#payment_method_cod")).click();
             Thread.sleep(2000);
             WebElement terms = driver.findElement(By.id("terms"));

             if (!terms.isSelected()) {
                 terms.click();
             }
             driver.findElement(By.cssSelector("#place_order")).click();
             System.out.println("order is successfully placed");
	}

}
}