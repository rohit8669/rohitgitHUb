package practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.google.com/search?q=javascript&rlz=1C1RXQR_enIN1030IN1030&oq=jav&aqs=chrome.1.69i57j69i59j0i67i650j0i67i131i433i650l4j0i67i650j0i67i1");
                      JavascriptExecutor f1 = (JavascriptExecutor)driver;
                      f1.executeScript("window.scrollBy(0,500)");
}
}
