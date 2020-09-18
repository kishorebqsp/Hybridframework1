package scripts;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Excelffile;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.AddtoCartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddingProducttoCart extends Basetest{
	@Test
	public void addingtocart()
	{
		LoginPage l=new LoginPage(driver);
		
		HomePage h = l.sigincreditials(Excelffile.getexceldata(excelpath, "Sheet1",1,0),Excelffile.getexceldata(excelpath,"Sheet1",1,1));
		Assert.assertEquals(driver.getTitle(),Propertyfile.getpropertyfiledata("homepagetitle"));
		ProductPage p = h.serachingproduct(Propertyfile.getpropertyfiledata("productname"));
		Utilies.dropdown(p.getPricedd(),Propertyfile.getpropertyfiledata("price"));
		AddtoCartPage a = p.productselectd();
		a.addbtn();
		Utilies.dropdown(a.getSizedd(),Propertyfile.getpropertyfiledata("size"));
		a.addingtocart();
		Assert.assertEquals(driver.getTitle(),Propertyfile.getpropertyfiledata("proceedtocheckouttitle"));
		
	}

}
