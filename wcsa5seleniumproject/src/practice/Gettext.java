package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.drive",",/drivers/chromedriver.exe");
	              WebDriver driver=new ChromeDriver();
	              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("https://www.google.com/search?q=instagram+login&oq=ins&aqs=chrome.1.69i57j69i59l3.52646127j0j15&sourceid=chrome&ie=UTF-8");
	         WebElement ele = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
                     String te = ele.getText();
                     System.out.println(te);
}
}
