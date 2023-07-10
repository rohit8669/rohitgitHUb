package methodsofwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandlemethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("http://omayo.blogspot.com/");
	         String r1 = driver.getWindowHandle();
	         System.out.println(r1);
}
}
