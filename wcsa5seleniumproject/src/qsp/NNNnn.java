package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//navigate forward
public class NNNnn {
public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.navigate().to("https://www.google.co.in/");
 Thread.sleep(5000);
 driver.navigate().refresh();
 
 Thread.sleep(5000);
 driver.navigate().back();
 
 Thread.sleep(5000);
 driver.navigate().forward();
 Thread.sleep(5000);
 driver.close();
 
}
}
