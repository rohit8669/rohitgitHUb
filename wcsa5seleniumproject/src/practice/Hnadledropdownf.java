package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hnadledropdownf {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/Admin/Documents/sinledropdowen.html");
	   WebElement rr = driver.findElement(By.id("menu"));
	                  Select ee = new Select(rr);
	         ee.selectByVisibleText("vada pav");
	         ee.selectByVisibleText("pav bhaji"); 
	             WebElement gg = ee.getWrappedElement();
	             System.out.println(gg);
	        }
	                 
	                
}

// System.out.println(ee.isMultiple());
//List<WebElement> eee = ee.getOptions();   
//for(int i=0;i<eee.size();i++)
//{System.out.println(eee.get(i).getText());
//}
//WebElement ff = ee.getFirstSelectedOption();
//System.out.println(ff);