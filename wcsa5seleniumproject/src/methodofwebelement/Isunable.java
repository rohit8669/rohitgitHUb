package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isunable {
public static void main(String[] args) {
	System.setProperty("webdrive.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://www.bluestone.com/?utm_campaig");
	     WebElement rr = driver.findElement(By.xpath("//div[@class='bottom-header']"));
	      // rr.isEnabled();
	       System.out.println(rr.isEnabled());
}
}
