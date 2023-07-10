package handlingdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getfirstselectoption {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	             WebDriver driver=new ChromeDriver();
	             driver.get("file:///C:/Users/Admin/Documents/sinledropdowen.html");
	             WebElement ele = driver.findElement(By.id("menu"));
	                    Select obj = new Select(ele);
	                   // boolean result = obj.isMultiple();
	            	//	System.out.println(result);
	            		List<WebElement> dropdownOptions =obj.getOptions();
	            		for(int i=0; i<dropdownOptions.size(); i++) 
	            		{
	            			String options = dropdownOptions.get(i).getText();
	            			System.out.println(options);
	            			Thread.sleep(1000);
	            		}
	            		
	            		WebElement firstOption = obj.getFirstSelectedOption();
	            		
	            		System.out.println("First Selected Option Is :"+firstOption.getText());
}
}
