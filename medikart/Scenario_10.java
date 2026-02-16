package medikart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Scenario_10 {

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
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.findElement(By.linkText("BIPAP Machines")).click();
        Select sortDropdown = new Select(
                driver.findElement(By.name("orderby")));
        sortDropdown.selectByValue("price");

        Thread.sleep(3000);
        List<Double> prices = new ArrayList<>();

        for (WebElement e :
                driver.findElements(
                        By.cssSelector("span.woocommerce-Price-amount bdi"))) {

            String priceText = e.getText();

            if (priceText.contains("–") || priceText.contains("-")) {
                priceText = priceText.split("[–-]")[0];
            }

            priceText = priceText.replaceAll("[^0-9.]", "");

            if (!priceText.isEmpty()) {
                prices.add(Double.parseDouble(priceText));
            }
        }

        System.out.println("Prices (Low → High): " + prices);

        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);

        System.out.println("Expected Sorted Prices : " + sortedPrices);
        System.out.println("Validation Result      : "
                + prices.equals(sortedPrices));

        
        sortDropdown.selectByValue("price-desc");
        Thread.sleep(3000);

        prices.clear();

        for (WebElement e :
                driver.findElements(
                        By.cssSelector("span.woocommerce-Price-amount bdi"))) {

            String priceText = e.getText();

      if (priceText.contains("–") || priceText.contains("-")) {
                priceText = priceText.split("[–-]")[0];
            }

            priceText = priceText.replaceAll("[^0-9.]", "");

            if (!priceText.isEmpty()) {
                prices.add(Double.parseDouble(priceText));
            }
        }

        System.out.println(" Prices (High → Low): " + prices);

        sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices, Collections.reverseOrder());

        System.out.println("Expected Sorted Prices : " + sortedPrices);
        System.out.println("Validation Result      : "
                + prices.equals(sortedPrices));

        driver.quit();
    }
	}



        