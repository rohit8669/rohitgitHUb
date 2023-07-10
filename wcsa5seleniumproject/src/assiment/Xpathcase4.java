package assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcase4 {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
	                 WebDriver driver=new ChromeDriver();
	                 driver.manage().window().maximize();
	                 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	                 driver.findElement(By.xpath("//input[contains(@name,'_token')]")).sendKeys("admin");
	                 driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
	                 driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	                
}
}
