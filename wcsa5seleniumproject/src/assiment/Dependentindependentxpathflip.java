package assiment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependentindependentxpathflip {
public static void main(String[] args) {
	System.setProperty("webdriver/chrome/driver","./drivers/chromedriver.exe");
 WebDriver	driver=new ChromeDriver();
 driver.get("https://www.flipkart.com/");
 driver.findElement(By.xpath("//button[text()='✕']")).click();
 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop",Keys.ENTER);
 driver.findElement(By.xpath("//div[text()='Brand']")).click();// not working
 driver.findElement(By.xpath("//div[text()='HP']")).click();
}
}

//div[@class='_2gmUFU _3V8rao' and text()='Brand'] multiple atribut
//div[text()='HP Victus Core i5 11th Gen - (8 GB/512 GB SSD/Windows 11 Home/4 GB Graphics/NVIDIA GeForce 
// GTX 1650) 1...']/../..//div[text()='₹58,990'           dependent and independent x path