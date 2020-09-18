package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusbtn;
	
	@FindBy(id="group_1")
	private WebElement sizedd;

	public WebElement getSizedd() {
		return sizedd;
	}
	
	@FindBy(name="Orange")
	private WebElement color;
	
	@FindBy(xpath="//span[.='Add to cart']")
	private WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckoutbtn;
	
	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void addbtn()
	{
		plusbtn.click();
	}
	
	public void addingtocart()
	{
		color.click();
		addtocart.click();
		proceedtocheckoutbtn.click();
	}

}
