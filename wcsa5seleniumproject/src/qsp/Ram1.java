package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ram1 {
public static void main(String[] args) throws InterruptedException {
  WebDriver	driver=new ChromeDriver();
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
  driver.manage().window().maximize();
  driver.get("https://www.netflix.com/in/Login");
  Thread.sleep(2000);
  driver.findElement(By.id("id_userLoginId")).sendKeys("rohitmane8669@gamil.com");
  driver.findElement(By.id("id_password")).sendKeys("12345");
  driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
  
}
}
