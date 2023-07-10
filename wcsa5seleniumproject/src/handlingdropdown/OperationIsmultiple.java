package handlingdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationIsmultiple {
public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	          WebDriver driver=new ChromeDriver();
	          driver.get("file:///C:/Users/Admin/Documents/sinledropdowen.html");
	          WebElement ele = driver.findElement(By.id("menu"));
	                //  boolean result=ele;
	                    Select eee = new Select(ele);
	       List<WebElement> ddd = eee.getOptions();
	       for(WebElement op:ddd)
			 {  
	    	   String text = op.getText();
				System.out.println(text);
				 
			 }
}
}
