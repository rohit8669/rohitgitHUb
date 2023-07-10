package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		         WebDriver driver=new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		         driver.get("http://omayo.blogspot.com/");
		         String r1 = driver.getWindowHandle();//parent add
		       //  System.out.println(r1);
		         driver.findElement(By.partialLinkText("Open a popup window")).click();
		         Set<String> r2 = driver.getWindowHandles();//get chiled window address
		         for(String wh:r2)
		         {
		         
		         System.out.println(wh);
		         }
	}
}
