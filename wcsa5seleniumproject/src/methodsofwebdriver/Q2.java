package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//how to close all brower without quit
public class Q2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://omayo.blogspot.com/");
		WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
		childWindow.click();
		Set<String> r1 = driver.getWindowHandles();
		for(String r2:r1)
		{  Thread.sleep(3000);
			driver.switchTo().window(r2).close();
		}
		}
	  
	}

