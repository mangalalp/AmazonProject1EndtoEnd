package medikart;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario_5 {

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
        Scanner s1 = new Scanner(System.in);
        WebElement s2 = driver.findElement(By.name("s"));
        s2.sendKeys("Thermometer");
        Thread.sleep(4000);
        List<WebElement> list=        driver.findElements(By.xpath("//div[@class='wd-scroll-content']/div/div"));
        if (!list.isEmpty()) {
            list.get(0).click();
            Thread.sleep(3000);

            driver.findElement(By.name("add-to-cart")).click();
            System.out.println("Product added to cart");
        }

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(@href,'cart')]")).click();
        Thread.sleep(4000);
        String totalBefore = driver.findElement(
                By.xpath("//tr[@class='order-total']//span")).getText();
        System.out.println("Total before quantity change: " + totalBefore);

        driver.findElement(By.xpath("//button[contains(@class,'plus')]")).click();
        Thread.sleep(3000);

        String totalAfterIncrease = driver.findElement(
                By.xpath("//tr[@class='order-total']//span")).getText();
        System.out.println("Total after increase: " + totalAfterIncrease);

        driver.findElement(By.xpath("//button[contains(@class,'minus')]")).click();
        Thread.sleep(3000);
        String totalAfterDecrease = driver.findElement(
                By.xpath("//tr[@class='order-total']//span")).getText();
        System.out.println("Total after decrease: " + totalAfterDecrease);

        if (!totalBefore.equals(totalAfterIncrease)) {
            System.out.println("Total price updated correctly ");
        } else {
            System.out.println("Total price not updated ");
        }

        driver.quit();
    }
}








	
	













	


