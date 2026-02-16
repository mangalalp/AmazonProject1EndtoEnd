package medikart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario_1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://medikart.co.in/");
		Thread.sleep(2000);
		WebElement e1=	driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
		Thread.sleep(2000);
        e1.click();
        WebElement e2  =  driver.findElement(By.linkText("Create an Account"));
        e2.click();
        Thread.sleep(3000);
        WebElement e3  =  driver.findElement(By.id("reg_whatsapp_phone"));
        e3.sendKeys("8618148794");
        Thread.sleep(3000);
        WebElement e6  =  driver.findElement(By.id("send_whatsapp_otp"));
        e6.click(); //enter otp manually
        Thread.sleep(4000);
        WebElement e4  =  driver.findElement(By.id("reg_email"));
        e4.sendKeys("testautomate123@yopmail.com");
        Thread.sleep(3000);
        WebElement e5 =  driver.findElement(By.xpath("//button[text()='Register']"));
        e5.click();
        System.out.println("Registratin is completed");
        if(driver.getCurrentUrl().contains("my account"))
        {
        	System.out.println("login successful");
        }
        else
        {
        	System.out.println("login failed");
        }
	}

}
