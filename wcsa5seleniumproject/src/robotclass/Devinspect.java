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

public class Devinspect {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.manage().window().maximize();
	        driver.get("https://www.selenium.dev/downloads/");
	        WebElement ele = driver.findElement(By.xpath("//span[text()='Downloads']"));
	            Actions act = new Actions(driver);
	             act.contextClick(ele).perform();
	             
	             Robot robot = new Robot();
	             for(int i=0;i<=5;i++)
	             {
	            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	            robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	             }//pagedown
	             
	             robot.keyPress(KeyEvent.VK_ENTER);
	             robot.keyRelease(KeyEvent.VK_ENTER);
}

}
