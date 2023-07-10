package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olxauto {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.get("https://www.google.com/");
  driver.switchTo().activeElement().sendKeys("olx car",Keys.ENTER);
  driver.findElement(By.partialLinkText("Buy & Sell Used Cars in Pune")).click();
  driver.findElement(By.xpath("//img[@class='_2hBzJ']")).click();
}
}
