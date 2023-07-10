package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsmethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.google.com/");
	        driver.switchTo().activeElement().sendKeys("ktm");
	        List<WebElement> bike = driver.findElements(By.xpath("//span[text()='ktm']"));
	        for(int i=0;i<=bike.size();i++)
	        {System.out.println(bike.get(i).getText());
	        Thread.sleep(3000);
	        }
	        }
}

