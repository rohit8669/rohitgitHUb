package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class Validloginpage extends BaseTest {
   public static void main(String[] args) throws IOException, InterruptedException {
	

	            
	        BaseTest kk=new BaseTest();
	        kk.openbrowser();
	      
	            Flib flib=new Flib();
			
			driver.findElement(By.name("username")).sendKeys(flib.readpropertydata(PROP_PATH,"Username"));
			driver.findElement(By.name("pwd")).sendKeys(flib.readpropertydata(PROP_PATH,"Password"));
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			kk.closeBrowser();
   }	          
}
