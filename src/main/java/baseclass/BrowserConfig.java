package baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Pfilereader;

public class BrowserConfig {
static WebDriver driver;
	public static WebDriver getdriver()
	{
		
	
		
if(Pfilereader.pfilereader("Browser").equalsIgnoreCase("chrome"))

	driver=new ChromeDriver();

else
	System.out.println("Invalid Browser");

driver.get(Pfilereader.pfilereader("url"));
		return driver;
	}
}
