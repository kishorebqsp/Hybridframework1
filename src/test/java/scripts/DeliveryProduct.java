package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Excelffile;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class DeliveryProduct extends Basetest{
	@Test
	public void productdelivery()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.sigincreditials(Excelffile.getexceldata(excelpath, "Sheet1",1,0),Excelffile.getexceldata(excelpath,"Sheet1",1,1));
		Utilies.mousehover(driver,h.getDressbtn());
		ProductPage p = h.selectingdress();
		p.deliveryproduct();
		Assert.assertEquals(driver.getTitle(),Propertyfile.getpropertyfiledata("deliverytitle"));
	}

}
