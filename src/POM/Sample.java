package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
			private WebElement account;
	
	@FindBy(xpath="//a[@data-track='login']")
	private WebElement login;
	
	@FindBy(name="email")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement passwordtxtbox;
	
	@FindBy(xpath="//button[.='Log in']")
	private WebElement loginbtn;
	
	
	
	public Sample(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void account1()
	{
		account.click();
	}
	public void login1()
	{
		login.click();
	}
	public void email1(String dummy)
	{
		usernametb.sendKeys(dummy);
	}
	public void password1(String passw)
	{
		passwordtxtbox.sendKeys(passw);
	}
	public void login2()
	{
		loginbtn.click();
	}
}
