package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcards {
	
	
	@FindBy(xpath="//button[.='SEND GIFT CARD']")
	private WebElement sendgift;
	
	@FindBy(xpath="//a[@data-track='coupons']")
	private WebElement coupon;
	
	public Giftcards(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendgiftcard()
	{
		sendgift.click();
	}
	
	public void coupons()
	{
		coupon.click();
	}
	
	
	
}
	
	
	
	
	
	