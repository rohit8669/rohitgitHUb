package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readmultipledatafromexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	//Read data from ipl sheet
	// implementation of read the data frome excel
	//readmultiple values or data from excel sheet by using for loop
	 for(int i=1;i<=6;i++)
	 
	{FileInputStream fis = new FileInputStream("./data/rohit.xlsx");
Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheet("r1");
                Row row = sheet.getRow(i);
               Cell cell = row.getCell(0);
                      String data = cell.getStringCellValue();
                      Thread.sleep(3000);
                      System.out.println(data);
	}
	
}
}
