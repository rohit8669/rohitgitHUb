package takesceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way5 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.bluestone.com/");
	        EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	                 File fef = efw.getScreenshotAs(OutputType.FILE);
	                        File rrr = new File("./screenshot/blueeee.png");
	                        Files.copy(fef, rrr);
}
}
