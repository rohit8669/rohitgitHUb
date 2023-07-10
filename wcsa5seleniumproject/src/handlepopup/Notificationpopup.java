package handlepopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	               ChromeOptions eo = new ChromeOptions();
	     eo.addArguments("--disable-notifications");
	             WebDriver  driver= new ChromeDriver(eo);//eo
	             driver.manage().window().maximize();
	             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	             driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytr");
}
}
