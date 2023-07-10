package assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assimentg2 {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	//driver.findElement(By.id("APjFqb")).sendKeys("youtube",Keys.ENTER);
	driver.findElement(By.id("APjFqb")).sendKeys("panipat",Keys.ENTER);
}
}
