package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//close chile browser only
public class Closebrowserwithouquit {
public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("http://omayo.blogspot.com/");
		  driver.findElement(By.partialLinkText("Open a popup window")).click();
		          String r2 = driver.getWindowHandle();
		  Set<String> r1 = driver.getWindowHandles();
		  for(String g:r1)
		  { if(!g.equals(r2))
		  {  driver.switchTo().window(g).close();
		      
		  }
		  
		  
		  }    
		  }
}

