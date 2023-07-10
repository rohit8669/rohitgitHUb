package javascripexicuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rebockshoes {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("https://in.puma.com/in/en?gclid=Cj");
	      WebElement rrr = driver.findElement(By.xpath("(//img[@class='w-full bg-puma-black-800 aspect-1-1'])[2]"));
                      Point r1 = rrr.getLocation();
                     
                     int xaxis = r1.getX();
             		 int yaxis = r1.getY();
             	//  System.out.println(xaxis);
             	// System.out.println(yaxis);
              JavascriptExecutor m1 = (JavascriptExecutor)driver;
             m1.executeScript("window.scrollBy("+xaxis+","+yaxis+")");   //(yaxis-100)
}
}
