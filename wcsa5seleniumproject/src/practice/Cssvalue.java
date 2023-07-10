package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssvalue {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	               WebDriver driver=new ChromeDriver();
	               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  	         driver.get("https://www.instagram.com/accounts/login/");
	  	         WebElement link = driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d'])[1]"));
	                link.sendKeys("rohit");
	                String ele3 = link.getCssValue("color");
	                System.out.println(ele3);
	                   
}
}
