package readexceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public abstract class Writeexceldata {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//write the data in excel sheet..
	        FileInputStream fis = new FileInputStream("./data/test2.xlsx");//filenotfoundexception
	            Workbook wb = WorkbookFactory.create(fis);
	                      Sheet sheet = wb.getSheet("t1");
	                      Row row = sheet.getRow(1);
	 	                 Cell cell = row.createCell(3);
	 	                 cell.setCellValue("pune");
	 	     FileOutputStream fos = new FileOutputStream("./data/test2.xlsx");
	 	     wb.write(fos);
	 	                 
}
}
