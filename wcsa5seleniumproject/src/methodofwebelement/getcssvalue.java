package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssvalue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("https://www.instagram.com/accounts/login/");  
	         WebElement elem1 = driver.findElement(By.xpath("//input[@type='text']"));
	            elem1.sendKeys("rohit");
	            String eme2 = elem1.getCssValue("color");
	            System.out.println(eme2);
}
}
