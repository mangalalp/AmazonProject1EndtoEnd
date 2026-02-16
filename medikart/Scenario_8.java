package medikart;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Scenario_8 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://medikart.co.in/my-account/orders/");
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
Thread.sleep(4000);


driver.get("https://medikart.co.in/my-account/orders/");
Thread.sleep(4000);


WebElement ordersTable = driver.findElement(
        By.cssSelector("table.woocommerce-orders-table"));

List<WebElement> orders = ordersTable.findElements(
        By.cssSelector("tbody tr"));

if (orders.isEmpty()) {
    System.out.println(" No past orders found");
    driver.quit();
    return;
}

System.out.println("Orders found: " + orders.size());

for (WebElement order : orders) {

    String orderNo = order.findElement(
            By.cssSelector(".woocommerce-orders-table__cell-order-number"))
            .getText();

    String date = order.findElement(
            By.cssSelector(".woocommerce-orders-table__cell-order-date"))
            .getText();

    String status = order.findElement(
            By.cssSelector(".woocommerce-orders-table__cell-order-status"))
            .getText();

    String total = order.findElement(
            By.cssSelector(".woocommerce-orders-table__cell-order-total"))
            .getText();

    System.out.println("---------------------------------");
    System.out.println("Order No : " + orderNo);
    System.out.println("Date     : " + date);
    System.out.println("Status   : " + status);
    System.out.println("Total    : " + total);
}


WebElement firstOrder = orders.get(0);
WebElement viewBtn = firstOrder.findElement(
        By.cssSelector("a.woocommerce-button.view"));

((JavascriptExecutor) driver)
        .executeScript("arguments[0].click();", viewBtn);

System.out.println("✅ View Order opened successfully");

Thread.sleep(5000);
driver.quit();
}

}

	


