package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Pfilereader {

	public static String pfilereader(String name)
	{
		FileInputStream fis=null;
		Properties prop=null;
		try
		{
			fis=new FileInputStream("C:\\Users\\ctvla\\eclipse-workspace\\mavendemo2\\src\\main\\java\\resources\\config.properties ");					
			 prop=new Properties();
			prop.load(fis);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return prop.getProperty(name);
		
	}
}
