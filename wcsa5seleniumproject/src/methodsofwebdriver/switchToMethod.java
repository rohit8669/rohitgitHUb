package methodsofwebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("you tube",Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
		//.sendkey("jal gaya mara asaman",Keys.ENTER);
		//driver.switchTo(.).activeElement().sendKeys("selenium",Keys.ENTER);
		// to perform back operation
	//Thread.sleep(200);
	//	driver.navigate().back();
	//	Thread.sleep(200);
	//	driver.switchTo().activeElement()
		
	}

}
