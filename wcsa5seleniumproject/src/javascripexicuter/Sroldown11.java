package javascripexicuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sroldown11 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	             WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.selenium.dev/");
	  
	            JavascriptExecutor jj = (JavascriptExecutor)driver;
	            jj.executeScript("window.scrollBy(0,1000);");//down
	            Thread.sleep(2000);
	            jj.executeScript("window.scrollBy(,-500);");//up
}
}
