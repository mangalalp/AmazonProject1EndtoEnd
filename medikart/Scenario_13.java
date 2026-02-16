package medikart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Scenario_13 {

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
WebElement e7=driver.findElement(By.xpath("(//span[@class='wd-tools-inner'])[1]"));
Actions a1=new Actions(driver);
a1.moveToElement(e7).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("(//span[text()='Account details'])[1]")).click();
Thread.sleep(3000);

		WebElement email  =  driver.findElement(By.id("account_email"));
email.clear();
email.sendKeys("updatedprofile@test.com");

driver.findElement(By.name("save_account_details")).click();

WebElement successMsg = driver.findElement(By.cssSelector(".woocommerce-message"));
               

if (successMsg.getText().contains("Account details changed")) {
    System.out.println(" Profile updated successfully");
} else {
    System.out.println(" Profile update failed");
}

String updatedEmail = driver.findElement(By.id("account_email"))
        .getAttribute("value");

System.out.println("Updated Email: " + updatedEmail);

driver.quit();
}


	}


