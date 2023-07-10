package practice;
//////As
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pe {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	           FileInputStream tt = new FileInputStream("./data/As.xlsx");
	             Workbook gg = WorkbookFactory.create(tt);
	                      Sheet dd = gg.getSheet("ss");
	                      Row ss = dd.getRow(1);
	                      Cell aa = ss.getCell(0);
	                      String data = aa.getStringCellValue();
	                      System.out.println(data);
}
}
