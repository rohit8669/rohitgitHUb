package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveclick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	          WebDriver driver=new ChromeDriver();
	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	          driver.manage().window().maximize();
	          
	          
	          
	          driver.get("https://www.google.com/search?q=grill+&rlz=1C1RXQR_enIN1030IN1030&sxsrf=APwXEdf5uMD_FtuCf7azusUJgoXVcxftnQ%3A1686996900943&ei=pIeNZM6ROarfseMPkqip2AI&ved=0ahUKEwjO85GYicr_AhWqb2wGHRJUCisQ4dUDCBA&uact=5&oq=grill+&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIHCCMQigUQJzIQCAAQgAQQFBCHAhCxAxCDATIFCAAQgAQyCAgAEIAEELEDMg0IABCABBAUEIcCELEDMggIABCABBCxAzIFCAAQgAQyCAgAEIAEELEDMggIABCABBCxAzIFCAAQgAQ6CggAEEcQ1gQQsAM6CggAEIoFELADEEM6CggAEIAEEBQQhwI6BggAEBYQHkoECEEYAFC_AlipEWDLFmgBcAF4AYAB3AKIAc0VkgEHMC4yLjkuMZgBAKABAcABAcgBCg&sclient=gws-wiz-serp#cobssid=s");
            WebElement ele = driver.findElement(By.xpath("//h3[text()='Grill']"));
             
              Actions act=new Actions(driver);
              //act.contextClick(ele).perform();
               act.moveToElement(ele).perform();
               
               //act.doubleClick(ele).perform();// double click
}
}
