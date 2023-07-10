package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Writedatawiththehelpofmethod {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	Flib obj=new Flib();
    
    obj.writeExcelData("./data/SS.xlsx","Dhoni",5,4,"lala");
}
}
