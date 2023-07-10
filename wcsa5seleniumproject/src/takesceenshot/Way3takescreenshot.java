package takesceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way3takescreenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("https://www.caratlane.com/");
	      TakesScreenshot tks=(TakesScreenshot)driver;
	      File src = tks.getScreenshotAs(OutputType.FILE);
	      File dest = new File("./screenshot/shopperstock.png");
          
          Files.copy(src, dest);
   
}
}
