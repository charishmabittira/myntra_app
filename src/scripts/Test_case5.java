package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Home_page;
import POM.Sample;
import POM.Sortby;
import POM.product;
import generic.Auto_constant;
import generic.Excel1;

public class Test_case5 implements Auto_constant
{
	static
	{
		System.setProperty(key, value);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		String us=Excel1.abc(excelpath, "Sheet1", 1, 0);
		String pwd=Excel1.abc(excelpath, "Sheet1", 1, 1);
		String top=Excel1.abc(excelpath, "Sheet1", 1, 2);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Sample s=new Sample(driver);
		WebElement ele = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-user']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		s.login1();
		s.email1(us);
		s.password1(pwd);
		s.login2();
		Home_page h=new Home_page(driver);
		product p=new product(driver);
		WebElement ele2 = driver.findElement(By.xpath("//a[@data-group='women']"));
		a.moveToElement(ele2).perform(); 
		p.headphone();
		Thread.sleep(6000);
		p.branditem();
		Thread.sleep(6000);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='desktop-actions']"));
		a.moveToElement(ele1).perform();
		h.accountpage();
		h.logoutbtn();
		Thread.sleep(4000);
		driver.close();
	}

}
