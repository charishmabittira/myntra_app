package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Home_page;
import POM.Sample;
import POM.product;
import generic.Auto_constant;
import generic.Excel1;

public class Test_case2 implements Auto_constant
{
	static
	{
		System.setProperty(key, value);
	}

	public static void main(String[] args) throws InterruptedException 
	{
		String us1=Excel1.abc(excelpath, "Sheet1", 1, 0);
		String pwd1=Excel1.abc(excelpath, "Sheet1", 1, 1);
		String top1=Excel1.abc(excelpath, "Sheet1", 1, 2);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Sample s=new Sample(driver);
		WebElement ele = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-user']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		s.login1();
		s.email1(us1);
		s.password1(pwd1);
		s.login2();
		Thread.sleep(2000);
		Home_page h=new Home_page(driver);
		h.searchele(top1);
		h.searchele1();
		Thread.sleep(3000);
		WebElement ele5 = driver.findElement(By.xpath("//div[.='La Firangi']"));
		a.moveToElement(ele5).perform();
		product p=new product(driver);
		p.productpage();
		Thread.sleep(2000);
		p.addbag();
		Thread.sleep(2000);
		
		driver.close();
	}

}
