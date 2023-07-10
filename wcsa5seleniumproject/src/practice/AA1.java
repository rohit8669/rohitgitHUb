package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	                WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.manage().window().maximize();
    driver.get("https://www.adidas.co.in/originals?cm_mmc1=IN&cm_mmc2=PPC-Multiple--Multiple-Multiple-IN-EMEA-eCom-Paid_Search&gclid=Cj0KC");
    //driver.findElement(By.xpath("//button[@class='gl-modal__close']/  span[@class='gl-icon__wrapper']")).click();
   
   driver.findElement(By.xpath("//div[@class='sheet___2Zvfp page-content___2Bh3s']/ descendant::img[@id='tcm:209-1022508']")).click();
   Thread.sleep(3000);
   WebElement r1 = driver.findElement(By.xpath("//span[@class='gl-icon__wrapper']/ancestor::button[@class='gl-modal__close']"));
   for(int i=0;i<=2;i++) 
   { r1.click();
   }
   }
}

////div[@class='gl-modal gl-modal--mobile-full gl-modal--active gl-modal--full-mobile gl-modal--no-animation _account-portal-modal_1auzo_1 modal-position___NzK_w']/descendant:: button[@class='gl-modal__close']
//component-wrapper___n1twm gl-vspace-bpall-medium gl-vspace-bpl-large
//div[@class='sheet___2Zvfp page-content___2Bh3s']/ descendant::img[@id='tcm:209-1022508']
// //button[@class='gl-modal__close']