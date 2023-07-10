package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ram2 {
public static void main(String[] args) {// zoomato login page
	
   WebDriver	driver=new ChromeDriver();
   System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
   driver.manage().window().maximize();
   driver.get("https://www.justdial.com/");
    WebElement rest = driver.findElement(By.id("main-auto"));
    rest.sendKeys("JW Marriott Hotel (Juhu)",Keys.ENTER);
    driver.findElement(By.className("jdicon search_white_icon")).click();
    
}
}
