package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {
	public WebDriver driver;
	@FindBy(id="id_contact")
	private WebElement idorder;

	public WebElement getIdorder() {
		return idorder;
	}
	
	@FindBy(id="email")
	private WebElement emailaddress;
	
	@FindBy(id="id_order")
	private WebElement referaddress;
	
	@FindBy(id="fileUpload")
	private WebElement choosefile;
	
	@FindBy(id="submitMessage")
	private WebElement msg;
	
	public ContactusPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void sendaddress(String email,String address,String file)
	{
		emailaddress.sendKeys(email);
		referaddress.sendKeys(address);
		choosefile.sendKeys(file);
		msg.click();
	}
	

}
