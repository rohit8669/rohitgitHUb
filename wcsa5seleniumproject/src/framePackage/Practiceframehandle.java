package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceframehandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.bluestone.com/");
driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
Thread.sleep(3000);
WebElement r1 = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
driver.switchTo().frame(r1);
WebElement chatBox = driver.findElement(By.id("chat-icon"));
chatBox.click();

}
}
