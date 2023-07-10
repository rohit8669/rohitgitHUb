package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;//not geting a text

public class gettext {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	          WebDriver driver=new ChromeDriver();
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	          driver.get("https://www.justdial.com/");
	          WebElement webe = driver.findElement(By.xpath("//img[@title='Real Estate in Mumbai']"));
	          String ele = webe.getText();
	          System.out.println(ele);
	          
}
}
