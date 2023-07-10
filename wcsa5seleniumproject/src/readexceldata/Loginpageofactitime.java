package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpageofactitime {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("http://127.0.0.1/login.do;jsessionid=2jra9cs5bqh3");
	      
	         FileInputStream fe = new FileInputStream("./data/Actitimeloginpage.xlsx");
	          Workbook l = WorkbookFactory.create(fe);
	           Sheet sheet = l.getSheet("invalidinput");
	          Row row = sheet.getRow(1);
	           Cell cell = row.getCell(0);
	              String admin = cell.getStringCellValue();
	              //System.out.println(admin);
	              
	              FileInputStream fe1 = new FileInputStream("./data/Actitimeloginpage.xlsx");
		          Workbook l1 = WorkbookFactory.create(fe1);
		           Sheet sheet1 = l1.getSheet("invalidinput");
		          Row row1 = sheet1.getRow(1);
		           Cell cell1 = row1.getCell(1);
		              String admin1 = cell1.getStringCellValue();
	      
	      driver.findElement(By.xpath("//input[@name='username']")).sendKeys(admin);//pwd
	      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(admin1);
}
}
