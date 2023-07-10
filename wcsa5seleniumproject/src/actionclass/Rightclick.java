package actionclass;

import java.time.Duration;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rightclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
  WebDriver	driver=new ChromeDriver();
 	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	driver.get("https://www.bluestone.com/jewellery/watch+jewellery.html");
    
 	WebElement target = driver.findElement(By.xpath("(//a[@title='Earrings'])[1]"));
 	 
 	// To perform right click
 	   Actions act = new Actions(driver);
 	   Thread.sleep(3000);
 	   act.contextClick(target).perform();
	
}
}
