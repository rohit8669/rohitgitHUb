package keyworddrivenframework;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant {
//it is use to close the browser
      static WebDriver driver ;
      
	public  void openbrowser() throws IOException
	{
		Flib flib=new Flib();
		String browservalue = flib.readpropertydata(PROP_PATH,"Browser");

		String url = flib.readpropertydata(PROP_PATH,"Url");
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{    System.setProperty(CHROME_KEY,CHROME_PATH) ;
		
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browservalue.equalsIgnoreCase("Firefox"))
		{

			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}
		else if(browservalue.equalsIgnoreCase("Edge"))
		{

			System.setProperty(EDGE_KEY,EDGE_PATH);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(url);
		}

	}

	public void closeBrowser()
	{
		driver.quit();	
	}

		
		

}

