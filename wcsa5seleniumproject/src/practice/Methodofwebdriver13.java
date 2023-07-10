package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodofwebdriver13 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	                WebDriver driver= new ChromeDriver();
	               driver.get("https://www.google.co.in/");
	               driver.switchTo().activeElement().sendKeys("bike");
	               Thread.sleep(2000);
	  List<WebElement> bikes = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	 for(int i=1;i<bikes.size();i++)
	 {        String bikeop = bikes.get(i).getText();
	      System.out.println(bikeop);
	      Thread.sleep(4000);
	 }
	 }
}

	                                                            // Thread.sleep(2000);    
	                                                            //1 close();
	                                                            //navigate
	                                                            // 2 quit();
                                                              //get()
                                                             //grtTitle();
                                                                //getpageresurce
                                                                //getcurrentUrl
                                                                //mange()
                                                                //switch to