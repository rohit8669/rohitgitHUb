package handlepopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadpopup {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("http://omayo.blogspot.com/");
	      WebElement r1 = driver.findElement(By.xpath("//input[@id='uploadfile']"));
	       Actions act = new Actions(driver);
	       act.doubleClick(r1).perform();
	      File file = new File("./autoitprograms/file123.exe");
	      String abspath = file.getAbsolutePath();
         Runtime.getRuntime().exec(abspath);
         Thread.sleep(4000);
         Runtime.getRuntime().exec(abspath);
        // driver.quit();
}
}
