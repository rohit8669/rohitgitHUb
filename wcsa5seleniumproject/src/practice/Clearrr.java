package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearrr {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.facebook.com/");
	     WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
	     ele.sendKeys("rohitmane869@gmail.com");
	     Thread.sleep(5000);
	     ele.clear();
}
}
