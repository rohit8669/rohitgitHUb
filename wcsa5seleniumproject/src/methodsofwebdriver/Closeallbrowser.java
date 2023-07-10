package methodsofwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeallbrowser {
public static void main(String[] args) throws InterruptedException {
	              WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://omayo.blogspot.com/");
	  Thread.sleep(3000);
	  driver.close();
	  
}
}
