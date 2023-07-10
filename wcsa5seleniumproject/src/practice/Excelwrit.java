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

public class Excelwrit {//W
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fr = new FileInputStream("./data/write.xlsx");
	          Workbook dd = WorkbookFactory.create(fr);
	          Sheet sheet = dd.getSheet("W");
	                    Row row = sheet.getRow(1);
	                    Cell cell = row.createCell(4);
	                    cell.setCellValue("ram");
	                   FileOutputStream ss = new FileOutputStream("./data/write.xlsx");
	                   dd.write(ss);
}
}
