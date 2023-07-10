package methodsofwebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodMaximize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Dimension size =new Dimension(700, 800); //method :- Dimension size =new Dimension(700, 800);
	driver.manage().window().setSize(size);
	
}
}
