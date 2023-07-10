package methodsofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class practice {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.switchTo().activeElement().sendKeys("ram",Keys.ENTER);
}
}
