package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
      public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.flipkart.com/");
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		   
		      Robot robot = new Robot();
		      robot.keyPress(KeyEvent.VK_CONTROL);
		      robot.keyPress(KeyEvent.VK_P);
		      
		      robot.keyRelease(KeyEvent.VK_CONTROL);
		      robot.keyRelease(KeyEvent.VK_P);
		      
		      robot.keyPress(KeyEvent.VK_ENTER);
		      robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
