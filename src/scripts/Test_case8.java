package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import POM.Sample;
import POM.Shoppingbag;
import generic.Auto_constant;
import generic.Excel1;

public class Test_case8 implements Auto_constant
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
		Shoppingbag s2=new Shoppingbag(driver);
		s2.shopbag();
		Thread.sleep(6000);
		s2.applyshop();
		Thread.sleep(6000);
		driver.close();
	}

}
