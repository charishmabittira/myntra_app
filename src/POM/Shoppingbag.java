package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppingbag {
	
	
	@FindBy(xpath="//a[@class='desktop-cart']")
	private WebElement shop;
	
	@FindBy(xpath="//a[@class='blue apply-coupon apply m-hide']")
	private WebElement apply;
	
	public Shoppingbag(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void shopbag()
	{
		shop.click();
	}
	
	public void applyshop()
	{
		apply.click();
	}
	
	
}