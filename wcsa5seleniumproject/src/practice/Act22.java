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

public class Act22 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	           WebDriver driver=new ChromeDriver();
	           driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://www.google.com/search?q=javascript&rlz=1C1RXQR_enI");
	 driver.findElement(By.xpath("(//div[@class='L3Ezfd'])[1]")).click();
	 WebElement r1 = driver.findElement(By.xpath("//span[text()='What is JavaScript are used for?']"));
	     Actions act = new Actions(driver);
	     Robot robot = new Robot();
	    for(int i=1;i<=2;i++)
	    {
	     act.doubleClick(r1).perform();
	     act.clickAndHold(r1).perform();
	    }
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_C);
	    Thread.sleep(3000);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_C);
	    
	     driver.findElement(By.id("APjFqb")).click();
	     
	     Thread.sleep(3000);       
	           for(int i=1;i<=10;i++)
	           {robot.keyPress(KeyEvent.VK_BACK_SPACE);
	           robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	           }
	          
	           //driver.findElement(By.id("APjFqb")).click();
	           robot.keyPress(KeyEvent.VK_CONTROL);
	   	        robot.keyPress(KeyEvent.VK_V);
	   	    Thread.sleep(3000);
	   	    robot.keyRelease(KeyEvent.VK_CONTROL);
	   	    robot.keyRelease(KeyEvent.VK_V);
}
}
