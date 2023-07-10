package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//close chile browser
public class Q4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://omayo.blogspot.com/");
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		childWindow.click();
		    String r1 = driver.getWindowHandle();
		    Thread.sleep(3000);
		   Set<String> r2 = driver.getWindowHandles();
		   for(String r3:r2) 
		   { if(!r3.equals(r1))
		   {
			   Thread.sleep(3000);
			   driver.switchTo().window(r3).close();
		   }
		   }
		   }
		   }


