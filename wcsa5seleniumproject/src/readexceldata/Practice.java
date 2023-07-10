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

public class Practice {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fe = new FileInputStream("./data/test.xlsx");
	            Workbook wb = WorkbookFactory.create(fe);
	                 Sheet sheet = wb.getSheet("IPL");
	                 Row row = sheet.getRow(3);
	                 Cell cell = row.createCell(4);
	                  cell.setCellValue("ram");
	                  FileOutputStream rr = new FileOutputStream("./data/test.xlsx");
	                  wb.write(rr);
	               //  String data = cell.getStringCellValue();
	               //  System.out.println(data);
}
}
