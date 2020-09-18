package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilies {
	
	public static void dropdown(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(value);
	}
	
	public static void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public static void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public static void scrollbar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
	}

	public static void implicitywait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
}
