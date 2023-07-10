package assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byusinxpath {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
  
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohit8669@gmail.com");
  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
  driver.findElement(By.xpath("//button[@value='1']")).click();
}
}
