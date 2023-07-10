package assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcartautomat {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com/");
  driver.switchTo().activeElement().sendKeys("https://www.flipkart.com/",Keys.ENTER);
  driver.findElement(By.partialLinkText("Online Shopping Site for Mobiles, Electronics, Furniture ...")).click();
  driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("manshoes",Keys.ENTER);
  driver.findElement(By.linkText("✕")).click();
}
}
