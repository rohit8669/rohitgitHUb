package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selected {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.manage().window().maximize();
	       driver.get("file:///C:/Users/Admin/Documents/sinledropdowen.html");
	       
	       WebElement ele = driver.findElement(By.id("menu"));
	       Select rrr = new Select(ele);
	        rrr.selectByVisibleText("misal pav");
	         boolean sel = driver.findElement(By.xpath("//option[text()='misal pav ']")).isSelected();
             System.out.println(sel);
             rrr.deselectByVisibleText("misal pav");
              
} 
}
