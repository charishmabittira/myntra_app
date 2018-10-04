package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Register;
import generic.Auto_constant;
import generic.Excel1;

public class Test_case3 implements Auto_constant {
static
{
	System.setProperty(key, value);
}
public static void main(String[] args) throws InterruptedException 
{
	String us3=Excel1.abc(excelpath , "sheet3", 0, 0);
	String pwd3=Excel1.abc(excelpath, "sheet3", 0, 1);
	String mob=Excel1.abc(excelpath, "sheet3", 0, 2);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Register r=new Register(driver);
	r.accpage();
	r.regpage();
	r.signupp(us3);
	r.passsw(pwd3);
	
	r.mobno(driver);
	r.gendr();
	r.female();
	r.regi();
}
}
