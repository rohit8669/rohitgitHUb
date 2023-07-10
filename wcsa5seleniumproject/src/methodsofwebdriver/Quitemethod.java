package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Quitemethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='open a popup window']")).click();
	   driver.quit();
	   driver.close();
	   
}
}
