package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findeelements {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	            WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.switchTo().activeElement().sendKeys("ktm");
	    Thread.sleep(3000);
	    List<WebElement> bike = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	     for(int i=0;i<bike.size();i++)
	     {  String rrr = bike.get(i).getText();
	      System.out.println(rrr);
	      //Thread.sleep(3000);
	     }
	     }
}

