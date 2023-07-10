package handlepopup;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Aiertpopup {//alert popup
public static void main(String[] args) throws  InterruptedException, AWTException {
  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("file:///C:/Users/Admin/Documents/alertpopup2.html");
       driver.findElement(By.xpath("//button[@type='button']")).click();
//                  Robot robot = new Robot();     
//                robot.keyPress(KeyEvent.VK_TAB);
//                 robot.keyRelease(KeyEvent.VK_TAB);
//                 Thread.sleep(4000);
//                 robot.keyPress(KeyEvent.VK_ENTER);
//                 robot.keyRelease(KeyEvent.VK_ENTER);
                   Thread.sleep(4000);
//                robot.keyPress(KeyEvent.VK_ENTER);
//               robot.keyRelease(KeyEvent.VK_ENTER);
                        Alert r1 = driver.switchTo().alert();
              r1.accept();
  
}
}
