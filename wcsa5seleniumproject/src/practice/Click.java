package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	         driver.get("https://www.google.com/search?q=instagram+login&oq=ins&aqs=chrome.1.69i57j69i59l3.52646127j0j15&sourceid=chrome&ie=UTF-8");
	         WebElement ele = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
   ele.click();
                      String ele2 = ele.getCssValue("color");
                      System.out.println(ele2);
}

}
