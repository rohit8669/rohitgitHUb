package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Actionclass 
public class Actionmovetoelement {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	               WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://www.google.com/search?q=selenium&rlz=1C1RXQR_");
	      driver.findElement(By.xpath("(//div[@class='L3Ezfd'])[1]")).click();
	 
	   WebElement ele = driver.findElement(By.xpath("(//span[@class='hgKElc'])[1]"));
             Actions ele2 = new Actions(driver);
             ele2.doubleClick(ele).perform();
              
             Robot robot = new Robot();
             robot.keyPress(KeyEvent.VK_CONTROL);
             robot.keyPress(KeyEvent.VK_C);
             robot.keyRelease(KeyEvent.VK_CONTROL);
             robot.keyRelease(KeyEvent.VK_C);

}
}
