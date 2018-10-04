package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sortby {
	
	@FindBy(xpath="//input[@value='discount']")
	public WebElement select;
	
	
	public Sortby(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	public void suits()
	{
		
		select.click();
	}
	
	
}
	
	
	
	
	
	