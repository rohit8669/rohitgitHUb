package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pract {
public static void main(String[] args) {
	System.setProperty("webdriver/shrome/drivr","./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://profile.justdial.com/Login/login");
  driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile']")).sendKeys("8669326053");// by using uniqe
  driver.findElement(By.xpath("//input[@placeholder='Password' and @name='pass']")).sendKeys("rohit");//by using multiple att
  driver.findElement(By.xpath("//a[@class='btn btn-jdlgin']")).click();//uniqe
}
}
