package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.Chromebrowser;

public class shoperstack {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
WebDriver	driver=new ChromeDriver();
Thread.sleep(2000);
driver.manage().window().maximize();
driver.get("https://www.shoppersstack.com/");
driver.findElement(By.xpath("//a[@id='electronics']")).click();
}
}
