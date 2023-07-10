package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         driver.get("https://www.selenium.dev/");
			 
			  Point ele = driver.findElement(By.xpath("//h2[.='News']")).getLocation();
			 
			 //int xaxis = ele.getX();
			 //int yaxis = ele.getY();
			 
			  System.out.println(ele);
			 //System.out.println("x axis of news webelement :"+ xaxis + " y axis of news webelement :"+yaxis);
}
}
