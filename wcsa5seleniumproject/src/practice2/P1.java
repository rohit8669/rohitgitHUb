package practice2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class P1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	               WebDriver driver=new ChromeDriver();
	               driver.manage().window().maximize();
	               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.bikewale.com/ktm-bikes/rc-200/");
	              TakesScreenshot r1 = (TakesScreenshot)driver;
	              File  tt = r1.getScreenshotAs(OutputType.FILE);
	             File s1 = new File("./screenshot/ktmtt.png");
	             Files.copy(tt, s1);
	  
}
}
