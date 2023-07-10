package actionclass;

import java.time.Duration;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToelement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.bluestone.com/");
	    driver.findElement(By.id("denyBtn")).click();
	   // driver.findElement(By.xpath("//a[@title='Watch Jewellery']")).click();
WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
		
		// to perform mouse actions on webelement..
		    Actions act = new Actions(driver);
		   
		    // to perform mouseHover action
		     
		    act.moveToElement(target).perform();
		     
		    driver.findElement(By.xpath("//a[.='Band']")).click();
}
}
