package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().window().maximize();
	   driver.get("https://www.instagram.com/accounts/login/");
	   boolean dd = driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[1]")).isDisplayed();
	   System.out.println(dd);
}
}
