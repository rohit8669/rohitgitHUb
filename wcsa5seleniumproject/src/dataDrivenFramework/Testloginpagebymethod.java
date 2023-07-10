package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testloginpagebymethod {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("http://127.0.0.1/login.do;jsessionid=2jra9cs5bqh3");
          Flib obj = new Flib();
          
          for(int i=1;i<=obj.finalRowCount("./data/Actitimeloginpage.xlsx","invalidinput");i++)
          {
        String admin = obj.readexceldata("./data/Actitimeloginpage.xlsx","invalidinput",i,0);
        String admin1 = obj.readexceldata("./data/Actitimeloginpage.xlsx","invalidinput",i,1);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(admin);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(admin1);
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='username']")).clear();
          }
          
}
}
