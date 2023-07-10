package handlepopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Allbrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.getProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	   ChromeOptions co = new ChromeOptions();
	   driver = new ChromeDriver(co);
	    driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytr");
	
	}

}
