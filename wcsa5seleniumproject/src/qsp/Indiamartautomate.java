package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methodsofwebdriver.switchToMethod;



public class Indiamartautomate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.get("https://www.google.com/");
  driver.manage().window().maximize();
  driver.switchTo().activeElement().sendKeys("indiamart login",Keys.ENTER);
  driver.findElement(By.partialLinkText("IndiaMART Seller Registration | Sell products online on ...")).click();
  driver.findElement(By.id("mobNo")).sendKeys("98765432");
  Thread.sleep(4000);
  driver.navigate().back();
  
}
}
