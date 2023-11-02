package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BrowserConfig;

public class Test2 {
	
WebDriver driver;
@BeforeTest
	public void get()
	{
		driver=BrowserConfig.getdriver();
	}
  @Test(groups="smoke")
  public void f() {
	  System.out.println("second class test");
  }
  
  @AfterTest
  public void close()
  {
	  driver.close();
  }
}
