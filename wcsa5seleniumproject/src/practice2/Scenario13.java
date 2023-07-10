package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario13 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	               WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&ut");
	       driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	       driver.findElement(By.xpath("//span[text()='Offers ']")).click();
	       WebElement rr = driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]"));
	       rr.click();
	   WebElement ee = driver.findElement(By.xpath("//div[@class='mousetrap']"));
	   if(ee.isDisplayed())
	   {
	   driver.close();
	   }
	   
	   
	   }
}

