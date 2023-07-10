package practice;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclick {
public static void main(String[] args) throws AWTException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	             WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.google.com/search?q=javascript&rlz");
	//  driver.findElement(By.xpath("//button[text()='✕']")).click();
	              Actions sss = new Actions(driver);
	    WebElement rrr = driver.findElement(By.xpath("//span[text()='Programming language']"));
	          sss.doubleClick(rrr).perform();
	                   // Robot robot = new Robot();
	                   // robot.keyPress(KeyEvent.VK_CONTROL);
	                  //  robot.keyPress(KeyEvent.VK_C);
	                    
	                 //   robot.keyRelease(KeyEvent.VK_CONTROL);
	                 //   robot.keyRelease(KeyEvent.VK_C);
}
}
