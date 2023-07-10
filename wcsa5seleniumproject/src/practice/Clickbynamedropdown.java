package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Clickbynamedropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	               WebDriver  driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/Admin/Documents/sinledropdowen.html");
	    WebElement ele = driver.findElement(By.id("menu"));
	     
	            Select se = new Select(ele);
	            se.selectByVisibleText("vada pav");
}
}
