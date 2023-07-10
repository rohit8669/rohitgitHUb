package readexceldata;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class Actitimewithflibmethod {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver  driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=dgi05nilujm");
	  Flib obj = new Flib();
	  for(int i=0;i<=obj.finalRowCount("./data/testdata.xlsx","invalid");i++)
	  {
	  String username = obj.readexceldata("./data/testdata.xlsx","invalid",i,0);
	  String pass = obj.readexceldata("./data/testdata.xlsx","invalid",i,1);
	   
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
	 Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@id='loginButton']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@name='username']")).clear();
	  }
	
	
	
	
	
}
}


