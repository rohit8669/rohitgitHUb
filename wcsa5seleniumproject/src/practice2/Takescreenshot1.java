package practice2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshot1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.manage().window().maximize();
	      driver.get("https://www.justdial.com/");
	                 TakesScreenshot tt = (TakesScreenshot)driver;
	                 File rr = tt.getScreenshotAs(OutputType.FILE);
	                 File ee = new File("./screenshot/justdial.png");
	                 Files.copy(rr, ee);
}
}
