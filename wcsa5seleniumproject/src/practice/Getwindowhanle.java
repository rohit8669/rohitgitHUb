package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//getwindowhanle and getwindowhandles
public class Getwindowhanle {
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
           WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://omayo.blogspot.com/");
        String dr = driver.getWindowHandle();
        System.out.println(dr);
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	Set<String> ff = driver.getWindowHandles();
	for(String rr:ff)
	{
		System.out.println(rr);
	}
	Thread.sleep(3000);
	//driver.quit();
	driver.close();
	
	
}
}
