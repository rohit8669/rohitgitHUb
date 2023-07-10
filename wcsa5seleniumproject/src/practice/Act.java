package practice;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Action class is use to perform mouse ouer action
public class Act {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/search?q=javascript&rlz=1C1");
	
	WebElement rr = driver.findElement(By.xpath("//span[text()='JavaScript']"));
	       Actions act = new Actions(driver);
	     act.doubleClick(rr).perform();
}
}
