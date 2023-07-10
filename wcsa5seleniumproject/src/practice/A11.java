package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//alert popup
public class A11 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.get("https://www.google.com/");
        driver.switchTo().activeElement().sendKeys("ktm");
        Thread.sleep(2000);
        List<WebElement> r1 = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
        for(int i=0;i<r1.size();i++)
        {
        	String t = r1.get(i).getText();
        	System.out.println(t);
        	Thread.sleep(1000);        }
        }
}

