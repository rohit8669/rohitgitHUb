package practice2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexicuter1 {
public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.justdial.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     JavascriptExecutor d1 = (JavascriptExecutor)driver;
	     d1.executeScript("window.scrollBy(0,1500)");
}
}
