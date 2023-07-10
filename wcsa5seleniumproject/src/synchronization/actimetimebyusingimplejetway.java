package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actimetimebyusingimplejetway {
public static void main(String[] args) {
	System.setProperty("webdriver/chromedriver/driver","./drivers/chromedriver.exe");
	                    WebDriver driver=new ChromeDriver();
	               //     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	           driver.get("http://127.0.0.1/login.do;jsessionid=vmne06i4cl7u");
	          String fisturl=driver.getTitle();
	          if(fisturl.equals("actiTIME - Login"))
	          {
	           driver.findElement(By.xpath("(//input[@class='textField'])[1]")).sendKeys("admin");
	           driver.findElement(By.xpath("(//input[@class='textField'])[2]")).sendKeys("manager");
	          driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	          }
	          else
	          {
	        	  System.out.println("we will get exception");
	          }
	          // we are in home page
	                    String curl=driver.getTitle();
	                  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	                 // wait.until(ExpectedConditions.titleContains(curl));
	                 // System.out.println("title is match,test case pass");
	          if(curl.equals ("actiTIME - Enter Time-Track"))
	           {System.out.println("title is match,test case pass");
	          }
	           else
	          {System.out.println("we will get exception");
	          }
	           }
	           }



	
