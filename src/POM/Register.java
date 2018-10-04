package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	private WebElement accountpag;
	
	@FindBy(xpath="//a[@class='desktop-linkButton']")
	private WebElement reg;
	
	@FindBy(name="email")
	private WebElement emailid;
	
	@FindBy(name="password")
	private WebElement passwd;
	
	@FindBy(name="mobile")
	private WebElement mob;
	
	@FindBy(xpath="//fieldset[@class='register-gender']")
	private WebElement gender;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement femalee;
	
	@FindBy(xpath="//button[.='REGISTER']")
	private WebElement regg;
	
	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void accpage()
	{
		accountpag.click();
	}
	
	public void regpage()
	{
		reg.click();
	}
	
	public void signupp(String chari)
	{
		emailid.sendKeys(chari);
	}
	
	public void passsw(String ash)
	{
		passwd.sendKeys(ash);
	}
	
	public WebElement mobno(WebDriver driver)
	{
		WebElement ele=driver.findElement(By.name("mobile"));
		ele.sendKeys("8050130257");
		return ele;
	}
	
	public void gendr()
	{
		gender.click();
	}
	
	public void female()
	{
		femalee.click();
	}
	
	public void regi()
	{
		regg.click();
	}
	
	

}
