package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbyindex {
public static void main(String[] args) {
	System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Documents/sinledropdowen.html");
	       WebElement ele = driver.findElement(By.id("menu"));
	               Select sel = new Select(ele);
	               sel.selectByIndex(2);
}
}
