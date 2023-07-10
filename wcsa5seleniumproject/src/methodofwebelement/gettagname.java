package methodofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettagname {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	      //  driver.get("https://www.instagram.com/accounts/login/");
	        // System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getTagName());
	         driver.get("http://desktop-aigvo6j/login.do");
	 		System.out.println(driver.findElement(By.id("loginButton")).getTagName());
	         
}
}
