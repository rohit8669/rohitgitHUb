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

public class WriteinXcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	          FileInputStream fis = new FileInputStream("./data/GGG.xlsx");
	           Workbook dd = WorkbookFactory.create(fis);
	           
	           Sheet sheet = dd.getSheet("FFF");
	          
                  int roenum = sheet.getLastRowNum();
	           System.out.println(roenum);
	          }
}
