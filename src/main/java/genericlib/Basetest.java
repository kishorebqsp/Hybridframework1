package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Autoconstant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.get(Propertyfile.getpropertyfiledata("url"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp(ITestResult r)
	{
		String name = r.getName();
		int status = r.getStatus();
		if(status==2)
		{
			Photo.getphoto(driver, name, name);
		}
		driver.close();
	}

}
