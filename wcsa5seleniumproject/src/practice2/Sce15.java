package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sce15 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&ut");
driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
       Actions act = new Actions(driver);
WebElement rr = driver.findElement(By.xpath("//li[@id='goldCoins']"));
act.moveToElement(rr).perform();
driver.findElement(By.xpath("(//span[text()='2 gram'])[1]")).click();
WebElement ff = driver.findElement(By.xpath("//h1[text()='2 gram 24 KT Gold Coin']"));
if(ff.isDisplayed())
{
	driver.quit();
}
}
}
