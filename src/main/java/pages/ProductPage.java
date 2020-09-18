package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Printed Summer Dress']")
	private WebElement dress;
	
	@FindBy(id="selectProductSort")
	private WebElement pricedd;
	
	public WebElement getPricedd() {
		return pricedd;
	}
	
	@FindBy(id="layered_id_attribute_group_1")
    private WebElement sizecb;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement deleiverybtn;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	public AddtoCartPage productselectd()
	{
		dress.click();
		return new AddtoCartPage(driver);
	}
	
	public void deliveryproduct()
	{
		sizecb.click();
		deleiverybtn.click();
	}

}
