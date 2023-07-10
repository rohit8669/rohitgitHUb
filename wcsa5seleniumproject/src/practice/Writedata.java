package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	        FileInputStream fr = new FileInputStream("./data/Ram.xlsx");
	              Workbook rr = WorkbookFactory.create(fr);
	              Sheet sheet = rr.getSheet("Sham");
	              Row row = sheet.getRow(2);
	              Cell cell = row.createCell(2);
	                      cell.setCellValue("ram");
	                      FileOutputStream ft = new FileOutputStream("./data/Ram.xlsx");
	                  rr.write(ft);
	                  
//	                  FileInputStream fis = new FileInputStream("./data/test2.xlsx");//filenotfoundexception
//	  	            Workbook wb = WorkbookFactory.create(fis);
//	  	                      Sheet sheet = wb.getSheet("t1");
//	  	                      Row row = sheet.getRow(1);
//	  	 	                 Cell cell = row.createCell(3);
//	  	 	                 cell.setCellValue("pune");
//	  	 	     FileOutputStream fos = new FileOutputStream("./data/test2.xlsx");
//	  	 	     wb.write(fos);
}
}
