package genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements Autoconstant{
	
	public static String getpropertyfiledata(String keyvalue)
	{
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyfilepath));
		}
		catch(Exception e)
		{
			
		}
		return p.getProperty(keyvalue);
	}

}
