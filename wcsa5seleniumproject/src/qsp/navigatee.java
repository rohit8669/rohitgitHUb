package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class navigatee {
public static void main(String[] args) throws InterruptedException {
  WebDriver	driver=new ChromeDriver();
  driver.get("https://www.google.com/");
  Thread.sleep(2000);
  driver.switchTo().activeElement().sendKeys("panipat",Keys.ENTER);
}
}
