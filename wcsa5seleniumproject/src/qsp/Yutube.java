package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yutube {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers.chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
  driver.get("https://www.youtube.com/");
  driver.get("https://www.youtube.com/watch?v=HrZDnW6cGCA");
  //driver.findElement(By.xpath("//input[@id='search']")).sendKeys("jal gaya mera asaman",Keys.ENTER);

}
}
