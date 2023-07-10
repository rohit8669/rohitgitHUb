package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;  //not working

public class getlocation {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.get("https://www.selenium.dev/");
			 
			 Point newsElement = driver.findElement(By.xpath("//h2[.='News']")).getLocation(); 
			 
			 int xaxis = newsElement.getX();
			 int yaxis = newsElement.getY();
			 
			 
			 System.out.println("x axis of news webelement :"+ xaxis + " y axis of news webelement :"+yaxis);
}
}
