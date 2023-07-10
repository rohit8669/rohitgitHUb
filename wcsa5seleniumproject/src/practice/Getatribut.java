package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getatribut {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	         WebDriver driver=new ChromeDriver();
	         driver.get("https://www.google.com/search?q=instagram+login&oq=ins&aqs=chrome.1.69i57j69i59l3.52646127j0j15&sourceid=chrome&ie=UTF-8");
	         WebElement ele = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
	      
	         String te = ele.getAttribute("class");
                     System.out.println(te);
}
}
