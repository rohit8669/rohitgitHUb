package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//ppp    p
public class Readdatafromexcel {
      public static void main(String[] args) throws EncryptedDocumentException, IOException {
		     FileInputStream f1 = new FileInputStream("./data/ppp.xlsx");
		        Workbook f2 = WorkbookFactory.create(f1);
		          Sheet sheet = f2.getSheet("p");
		              Row row = sheet.getRow(3);
		             Cell cell = row.getCell(1);
		             String data = cell.getStringCellValue();
		             System.out.println(data);
	}
}
