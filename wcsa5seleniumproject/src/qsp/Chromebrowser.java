package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
public static void main(String[] args) throws InterruptedException
{
	 WebDriver  driver=new ChromeDriver();
	 //maximize browser
	 driver.manage().window().maximize();// close the browser
	 
	 Thread.sleep(2000);
	 driver.close();//procedur to web browser
	System.setProperty("webdriver.chrome.driver","./ drivers/chromedriver.exe");
}
	
}
