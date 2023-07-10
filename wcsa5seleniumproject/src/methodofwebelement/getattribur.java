package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribur {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	                    WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	          WebElement element = driver.findElement(By.xpath("//input[@type='password']"));
	          String classValue = element.getAttribute("type");
	   	   System.out.println(classValue);
		   
}
}
