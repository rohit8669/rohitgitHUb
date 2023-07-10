package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectmethod {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("file:///C:/Users/Admin/Documents/sinledropdowen.html");
	      WebElement ele = driver.findElement(By.id("menu"));
	      Select sel = new Select(ele);

	      sel.selectByVisibleText("vada pav");
	      sel.selectByVisibleText("pav bhaji");
	      sel.selectByVisibleText("pani puri");
	     Thread.sleep(2000);
	      //sel.deselectByVisibleText("vada pav");
	     sel.deselectAll();
	      
}
}
