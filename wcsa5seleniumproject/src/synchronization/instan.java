package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instan {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver/chrome/driver","./drivers/chromdriver.exe");
WebDriver	driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.instagram.com/accounts/login/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("rohitmane");
}
}
//input[name*='username']