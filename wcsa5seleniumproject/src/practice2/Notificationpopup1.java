package practice2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//notification popup
public class Notificationpopup1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//	 ChromeOptions ro = new ChromeOptions();
//	  ro.addArguments("--disable-notifications");//--disable-notifications
	     WebDriver  driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("file:///C:/Users/Admin/Documents/conf111.html");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     Thread.sleep(3000);
	     Alert r1 = driver.switchTo().alert();
	        r1.dismiss();
	     Thread.sleep(3000);
	    
}
}
