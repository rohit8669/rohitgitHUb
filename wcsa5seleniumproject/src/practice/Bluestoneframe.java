package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestoneframe {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	                  WebDriver  driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.bluestone.com/");
	        driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	        Thread.sleep(3000);
	       WebElement r1 = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
	        driver.switchTo().frame(r1);
	         driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
	       //  driver.switchTo().defaultContent();
	         driver.switchTo().parentFrame();
	         Thread.sleep(3000);
	         driver.findElement(By.id("chat-fc-name")).sendKeys("rohit avinash mane");
}
}
