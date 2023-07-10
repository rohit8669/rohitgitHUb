package practice;//write//r

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedatinexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	       FileInputStream f = new FileInputStream("./data/write.xlsx") ;
	                     Workbook cr = WorkbookFactory.create(f);
	                     Sheet sheet = cr.getSheet("r");
	                     Row row = sheet.getRow(1);
	                          Cell cell = row.createCell(4);
	                          cell.setCellValue("ram");
	                            FileOutputStream fr = new FileOutputStream("./data/write.xlsx");
	                        cr.write(fr);
//	FileInputStream fis = new FileInputStream("./data/write.xlsx");//filenotfoundexception
//    Workbook wb = WorkbookFactory.create(fis);
//              Sheet sheet = wb.getSheet("r");
//              Row row = sheet.getRow(1);
//              Cell cell = row.createCell(3);
//              cell.setCellValue("pune");
//  FileOutputStream fos = new FileOutputStream("./data/write.xlsx");
//  wb.write(fos);

}
}
