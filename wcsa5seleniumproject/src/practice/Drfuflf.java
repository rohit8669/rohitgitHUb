package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Drfuflf {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.bikewale.com/ktm-bikes/rc-200/");
   TakesScreenshot scr = (TakesScreenshot)driver;
   File r1 = scr.getScreenshotAs(OutputType.FILE);
   File r2 = new File("./screenshot/bl11.png");
            Files.copy(r1, r2);
}
}
