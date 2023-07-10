package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmovetoellement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.manage().window().maximize();
	       driver.get("https://www.justdial.com/");
	       WebElement ele = driver.findElement(By.xpath("//div[text()='Education']"));
	      Actions act = new Actions(driver);
	      act.doubleClick(ele).perform();
}
}
