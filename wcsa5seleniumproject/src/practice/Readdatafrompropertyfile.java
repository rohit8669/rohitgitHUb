package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdatafrompropertyfile {
public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream pro = new FileInputStream("./data/config.properties");
	           Properties pr = new Properties();
	           pr.load(pro);
	          String data = pr.getProperty("Username");
	          String data1 = pr.getProperty("Password");
	          //System.out.println(data);
	          
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe") ;    
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("http://127.0.0.1/login.do;jsessionid=bqmgkonmccm2");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data);
	  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(data1);
	  driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	  Thread.sleep(4000);
	  driver.quit();
}
}
