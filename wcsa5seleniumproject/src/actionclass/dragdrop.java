package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://demo.guru99.com/test/drag_drop.html");
	      WebElement target1 = driver.findElement(By.xpath("// a[text()=' 5000']"));
	     WebElement source1 = driver.findElement(By.xpath("(// li[@class='placeholder'])[4]"));
	             
	      WebElement target2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	  WebElement source2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	  
	        WebElement target3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	       WebElement source3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	     
	       WebElement target4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	       WebElement source4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	     
	     
	   Actions act=new Actions(driver);  
	   act.dragAndDrop(target1,source1).perform();
	   act.dragAndDrop(target2,source2).perform();
	   act.dragAndDrop( target3,source3).perform();
	   act.dragAndDrop( target4,source4).perform();
	   //if(driver.findElement(By.xpath("//a[text()='Perfect!']")==text())) 
	   }
 
}
