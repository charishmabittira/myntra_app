package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders {
	
	
	@FindBy(xpath="//button[.='ORDERS']")
	private WebElement order;
	
	@FindBy(xpath="//a[@data-reactid='8']")
	private WebElement track;
	
	
	public Orders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void orders()
	{
		order.click();
	}
	
	public void trackorders()
	{
		track.click();
	}
	
	
}
	