package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkey {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  WebElement elem = driver.findElement(By.xpath("//input[@name='username']"));
  WebElement elem1 = driver.findElement(By.xpath("//input[@type='password']"));
    elem.sendKeys("Admin");
    elem1.sendKeys("admin 123");
}
}
