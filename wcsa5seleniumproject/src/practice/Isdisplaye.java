package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//is diplayed
public class Isdisplaye {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		         WebDriver  driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("https://www.google.com/search?q=selenium&rlz=1C1RXQ");
		    WebElement ele = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		     boolean ele2 = ele.isDisplayed();
		    
		     if(ele.isDisplayed())
		     {
		     System.out.println("hi");
		     }
	}

}
