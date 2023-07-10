package takesceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class AllWay5 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	             driver.manage().window().maximize();
	             driver.get("https://in.puma.com/in/en?gclid=Cj");
	                  WebElement ro = (WebElement)driver;
	                  File r1 = ro.getScreenshotAs(OutputType.FILE);
	                  File r2 = new File("./screenshot/puma4.png");
	                  Files.copy(r1, r2);
	                  
}
}
//way first== TakesScreenshot ro = (TakesScreenshot)driver;//typecast
// way second == RemoteWebDriver ro = (RemoteWebDriver)driver;//typecast
//RemoteWebDriver driver=new ChromeDriver();//directly upcast wi remotewebdriver