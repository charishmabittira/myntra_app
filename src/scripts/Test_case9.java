package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Giftcards;
import POM.Home_page;
import POM.Sample;
import generic.Auto_constant;
import generic.Excel1;

public class Test_case9 implements Auto_constant {
static
{
	System.setProperty(key, value);
}
public static void main(String[] args) throws InterruptedException 
{
	String us4=Excel1.abc(excelpath , "sheet1", 1, 0);
	String pwd4=Excel1.abc(excelpath, "sheet1", 1, 1);
	String top1=Excel1.abc(excelpath, "Sheet1", 1, 2);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Sample s=new Sample(driver);
	WebElement ele = driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-user']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	s.login1();
	s.email1(us4);
	s.password1(pwd4);
	s.login2();
	Thread.sleep(2000);
	Home_page h=new Home_page(driver);
	WebElement ele1 = driver.findElement(By.xpath("//div[@class='desktop-actions']"));
	a.moveToElement(ele1).perform();
	h.accountpage();
	Giftcards g=new Giftcards(driver);
	
	Thread.sleep(4000);
	g.coupons();
	Thread.sleep(3000);
	
	
}
}

