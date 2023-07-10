package methodsofwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//how to close all browsers
public class Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		        WebDriver  driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://omayo.blogspot.com/");
	//driver.findElement(By.xpath("//input[@id='uploadfile']")).click();
	WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
	childWindow.click();
	driver.quit();
	}

}
