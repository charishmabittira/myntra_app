package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product {
	@FindBy(xpath="/div[.='La Firangi']")
			private WebElement product;
	
	@FindBy(xpath="//span[.='Add to bag']")
	private WebElement addtobag;
	
	@FindBy(xpath="//button[.='M']")
	private WebElement size;
	
	@FindBy(xpath="//a[@style='color:#fb56c1;']")
	private WebElement headset;
	
	@FindBy(xpath="//label[@class='vertical-filters-label common-customCheckbox']")
	private WebElement brand;
	
	
	public product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void productpage()
	{
		product.click();
	}
	public void addbag()
	{
		addtobag.click();
	}
	public void selectsize()
	{
		size.click();
	}
	public void headphone()
	{
		headset.click();
	}
	public void branditem()
	{
		brand.click();
	}
}

