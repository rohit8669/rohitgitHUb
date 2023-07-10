package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import dataDrivenFramework.Flib;

public class ReadAf {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    
//	   FileInputStream vv = new FileInputStream("./data/Aff.xlsx");
//	                Workbook hh = WorkbookFactory.create(vv);
//	                Sheet sheet = hh.getSheet("F");
//	                 Row row = sheet.getRow(1);
//	                  Cell cell = row.getCell(1);
//	                   String data = cell.getStringCellValue();
//	                   System.out.println(data);
	      Flib obj=new Flib();
	         
	    obj.writeExcelData("./data/test.xlsx","IPL",5,5,"lalalllllll");
	      
	      
}
}
