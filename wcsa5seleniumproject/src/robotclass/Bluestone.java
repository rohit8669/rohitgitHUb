package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {//its not done
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	            WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  driver.get("https://www.bluestone.com/");
	  driver.findElement(By.id("denyBtn")).click();
                  Actions action = new Actions(driver);
                  
	      WebElement ele = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	      WebElement ele2 = driver.findElement(By.xpath("//a[text()='Band']"));
	      action.moveToElement(ele).perform();
	      action.doubleClick(ele2).perform();
	 WebElement ele1 = driver.findElement(By.xpath("//div[text()='Filter by'] "));
	                     Thread.sleep(2000);
	                     for(int i=1;i<=2;i++)
	                     {
	          action.doubleClick(ele1).perform();
	          action.clickAndHold(ele1).perform();//imp method
	                     }
	        
	        Robot robot = new Robot();
	        robot.keyPress(KeyEvent.VK_CONTROL);
	          robot.keyPress(KeyEvent.VK_C);
	           
	         robot.keyRelease(KeyEvent.VK_CONTROL);
	          robot.keyRelease(KeyEvent.VK_C);
	          
	         
	         driver.findElement(By.id("search_query_top_elastic_search")).click();//give input in serch box
	         robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_V);
	         
	         robot.keyRelease(KeyEvent.VK_CONTROL);
	         robot.keyRelease(KeyEvent.VK_V);
	         
	          robot.keyPress(KeyEvent.VK_ENTER);
	          robot.keyRelease(KeyEvent.VK_ENTER);
	          WebElement ddd = driver.findElement(By.xpath("//h1[text()=' Search Results For \"filter By\" ']"));
	          if(ddd.isDisplayed())
	          {driver.quit();
	          }
	          }
}

