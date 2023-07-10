package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmehod {
public static void main(String[] args) throws InterruptedException //throws InterruptedException {
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	          WebDriver driver=new ChromeDriver();
	        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	       WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
	       WebElement ele1 =driver.findElement(By.xpath("//input[@type='password']"));
	          
	      ele.sendKeys("Admin");
	      ele1.sendKeys("admin123");
	      Thread.sleep(9000);
	    ele.clear();
	     ele1.clear();
} 
}
