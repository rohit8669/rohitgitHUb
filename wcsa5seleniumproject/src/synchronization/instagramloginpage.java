package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramloginpage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
 WebDriver	driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 
 driver.get("https://www.instagram.com/accounts/login/");
 
 driver.findElement(By.xpath("input[name*='username']")).sendKeys("rohitmane869");
 
 driver.findElement(By.xpath("input[name*='word']")).sendKeys("1233");
 driver.findElement(By.xpath("button[class*='ap']")).click();

}
}
