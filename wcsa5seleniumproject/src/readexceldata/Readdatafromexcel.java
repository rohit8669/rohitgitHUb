package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromexcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//Read data from ipl sheet
	// implementation of read the data frome excel
	FileInputStream fis = new FileInputStream("./data/rohit.xlsx.xlsx");//provide the path 
	Workbook wb = WorkbookFactory.create(fis);// make the file ready to read
	Sheet sheet = wb.getSheet("IPL");// get in to the sheet
	Row row = sheet.getRow(1);//get into the desired row//cell,colum and row
	Cell cell = row.getCell(1);
	String data = cell.getStringCellValue();//read they data from cell
	System.out.println(data);
	
}
}