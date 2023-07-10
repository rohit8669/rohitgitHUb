package takesceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Youtube {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.cheome.driver","./drivers/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.google.com/search?q=difference+between+stack+and+heap+memory+in+java");
	   TakesScreenshot pp=(TakesScreenshot)driver;
	          File ff = pp.getScreenshotAs(OutputType.FILE);
	           File ddd = new File("./screenshot/stackmemoeyHeapmomoey.png");
	           Files.copy(ff, ddd);
}
}
