package actionclass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;          // not working
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Doubleclick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	                   WebDriver driver=new ChromeDriver();
	                   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://github.com/gitHub28012/wcsa5Reository/tree/master/wcsa5seleniumproject/src");
	       WebElement target = driver.findElement(By.className("(//a[text()='commit'])[3]"));
	                   Actions eee = new Actions(driver);
	                   Thread.sleep(3000);
	                  // eee.contextClick(target).perform();
	                   eee.moveToElement(target).perform();
} 
}
