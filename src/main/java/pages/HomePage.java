package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(id="search_query_top")
	private WebElement searchtb;
	
	@FindBy(name="submit_search")
	private WebElement go;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressbtn;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
	private WebElement eveningdresssoption;
	
	public WebElement getDressbtn() {
		return dressbtn;
	}

	public HomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public ProductPage serachingproduct(String product)
	{
		searchtb.sendKeys(product);
		go.click();
		return new ProductPage(driver);
	}
	
	public ProductPage selectingdress()
	{
		eveningdresssoption.click();
		return new ProductPage(driver);
	}
}
