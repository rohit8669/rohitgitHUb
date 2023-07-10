package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//read data from property file
public class Reaadproperydata {
            public static void main(String[] args) throws IOException {
	FileInputStream po = new FileInputStream("./data/test.xlsx");
			        Workbook ff = WorkbookFactory.create(po);
			        Sheet sheet = ff.getSheet("IPL");
			        Row row = sheet.getRow(6);
			        Cell cell = row.createCell(0);
			        cell.setCellValue("ddd");
			        FileOutputStream fff = new FileOutputStream("./data/test.xlsx");
				      ff.write(fff);
				
				
            }
}
