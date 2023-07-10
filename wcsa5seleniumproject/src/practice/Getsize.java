package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	             WebDriver driver= new  ChromeDriver();
	             driver.get("https://www.selenium.dev/");
				 
	 Dimension ele = driver.findElement(By.xpath("//h2[.='News']")).getSize();
	 System.out.println(ele);
	 
} 
}
