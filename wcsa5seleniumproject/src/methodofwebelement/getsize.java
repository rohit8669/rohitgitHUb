package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	              WebDriver driver=new ChromeDriver();
	              driver.get("https://www.selenium.dev/");
	     		 
	     		 
	     		 Dimension newsElement = driver.findElement(By.xpath("//h2[.='News']")).getSize();
	              int height = newsElement.getHeight();
	     		 int width = newsElement.getWidth();
	     		 
	     		 System.out.println(height + " " + width);
}
}
