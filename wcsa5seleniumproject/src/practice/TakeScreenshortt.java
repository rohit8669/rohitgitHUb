package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshortt {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	                      WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("https://www.google.com/search?q=javascript&rlz");
	               TakesScreenshot obj=(TakesScreenshot)driver;
	               File fff = obj.getScreenshotAs(OutputType.FILE);
	                File ddd = new File("./screenshot/rohit.png");
	                Files.copy(fff, ddd);
	               
}
}
