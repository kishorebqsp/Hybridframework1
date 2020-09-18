package scripts;

import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.ContactusPage;
import pages.LoginPage;

public class Contatctus extends Basetest{
	@Test
	public void contacting()
	{
		LoginPage l=new LoginPage(driver);
		ContactusPage c = l.contactusbutton();
		Utilies.dropdown(c.getIdorder(),Propertyfile.getpropertyfiledata("heading"));
		c.sendaddress(Propertyfile.getpropertyfiledata("email"),Propertyfile.getpropertyfiledata("oderrefrence"),Propertyfile.getpropertyfiledata("file"));
	}

}
