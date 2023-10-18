package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_Reader {

	FileInputStream File_input;

	public Properties getPropertyFile()
	{
		File file = new File("C:\\Users\\Preethi Venkatesan\\eclipse-workspace\\GOIBIBO_TestNG\\src\\main\\java\\Utility\\Property_File.Properties");

		try {
			File_input = new FileInputStream(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(File_input);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

}

