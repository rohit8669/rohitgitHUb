package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scensrio17 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&ut");
driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
WebElement ff = driver.findElement(By.xpath("//a[text()='Coins ']"));
                   Actions rr = new Actions(driver);
                   rr.moveToElement(ff).perform();
    driver.findElement(By.xpath("(//span[text()='50 gram'])[2]")).click();
    WebElement jj = driver.findElement(By.xpath("//h1[text()='50 gram 22 KT Gold Coin']"));
    if(jj.isDisplayed())
    {
    driver.quit();
    }
        
}
}
//(//span[text()='50 gram'])[2]