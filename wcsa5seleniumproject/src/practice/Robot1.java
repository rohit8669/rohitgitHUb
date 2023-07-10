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

public class Robot1 {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       Robot robot = new Robot();
	       driver.get("https://www.google.com/search?q=javascript&rlz=1C1RXQR_enIN1030IN1030&oq=jav&aqs=chrome.1.69i57j69i59j0i67i650j0i67i131i433i650l4j0i67i650j0i67i1");
WebElement ac = driver.findElement(By.xpath("//span[text()='Programming language']"));
                    Actions act = new Actions(driver);
                    for(int i=1;i<=2;i++)
                    {
                    act.doubleClick(ac).perform();
                    act.clickAndHold(ac).perform();
                    }
                    Thread.sleep(4000);
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_C);
          Thread.sleep(4000);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_C);
          Thread.sleep(4000);
          WebElement s1 = driver.findElement(By.id("APjFqb"));
          act.moveToElement(s1);
          s1.clear();
          act.moveToElement(s1);
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          Thread.sleep(4000);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyRelease(KeyEvent.VK_V);
}
}
