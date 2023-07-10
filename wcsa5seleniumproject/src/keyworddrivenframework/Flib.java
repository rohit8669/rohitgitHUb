package keyworddrivenframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//use to read the data
	public String readexceldata(String a, String b, int c, int d) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(a);
		Workbook f2 = WorkbookFactory.create(f1);
		Sheet f3 = f2.getSheet(b);
		Row f4 = f3.getRow(c);
		Cell f5 = f4.getCell(d);
		String data = f5.getStringCellValue();
		return data;
	}
	
	 //to get final row count
		public int finalRowCount(String pathename, String Sheetname) throws EncryptedDocumentException, IOException {
			FileInputStream f1 = new FileInputStream(pathename);
			Workbook f2 = WorkbookFactory.create(f1);
			Sheet sheet = f2.getSheet(Sheetname);
			int lastc = sheet.getLastRowNum();
			return lastc;
     }
		//to data write 
		public void  writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis = new FileInputStream(excelPath);// provide the path of file
		    Workbook wb = WorkbookFactory.create(fis);// make the file for ready to read
		    Sheet sheet = wb.getSheet(sheetName);// get into the sheet
		    Row row = sheet.getRow(rowCount); // pass the row count
		    Cell cell = row.createCell(cellCount);// pass the cell count
		    cell.setCellValue(data); // pass the string arguments as data
		    
		    FileOutputStream fos = new FileOutputStream(excelPath);
		    wb.write(fos);
		}
		
		//read data the data from property file
		public String readpropertydata(String proppath,String key) throws IOException
		{       FileInputStream fis = new FileInputStream(proppath);
		        //creat a obj of properties class
		        Properties prop = new Properties();
		        //make file rady to read
		        prop.load(fis);
		        //read the particular key form file
		        String data = prop.getProperty(key);
		       return data;
		     
		    }
}
