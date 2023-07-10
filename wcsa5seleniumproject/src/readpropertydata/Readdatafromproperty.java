package readpropertydata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readdatafromproperty {
public static void main(String[] args) throws IOException {
	// read the data from config.properties file
	 FileInputStream fis = new FileInputStream("./data/config.properties");
	
	 //creat object of property class
	Properties prop = new Properties();
	
	//make file ready to read
	prop.load(fis);
	
	//read the perticular property
	String data = prop.getProperty("Browser");
	System.out.println(data);
}
}
