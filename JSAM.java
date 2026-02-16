package mdule1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM {

	public static void main(String[] args) throws InterruptedException {
		
		
		{
			

				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/Hp/Downloads/learningHTML1.html");
				Thread.sleep(2000);	
				WebElement e1=	driver.findElement(By.xpath("(/html/body/input)[1]"));
				e1.sendKeys("manish12345ty");
				WebElement e2=	driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
				e2.click();
				Thread.sleep(2000);	
				WebElement e3=	driver.findElement(By.xpath("/html/body/a"));
				//e3.click();
				
				WebElement e4=	driver.findElement(By.xpath("/html/body/select"));
				
				Select s1=new Select(e4);
				s1.selectByIndex(2);

				
			}
		}
		
		
			
			
				
			}
		
		

	


