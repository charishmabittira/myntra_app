package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy(xpath="//div[@class='desktop-actions']")
	private WebElement account2;
	
	@FindBy(xpath="//div[.=' Logout ']")
	private WebElement logout;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	private WebElement search;
	
	@FindBy(xpath="//a[@class='desktop-submit']")
	private WebElement search1;
	
	@FindBy(xpath="//a[@class='desktop-preHeaderLinks']")
	private WebElement gift;
	
	@FindBy(xpath="//a[@href='/contactus']")
	private WebElement contact;
	
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void searchele(String dress)
	{
		search.sendKeys(dress);
	}
	
	public void searchele1()
	{
		search1.click();
	}
	
	public void accountpage()
	{
		account2.click();
	}
	
	public void logoutbtn()
	{
		logout.click();
	}
	
	public void giftcard()
	{
		gift.click();
	}
	
	public void contactus()
	{
		contact.click();
	}


}
