package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String[] args) {
	System.setProperty("webdiver/chrome/driver","./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
 
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
}
}
