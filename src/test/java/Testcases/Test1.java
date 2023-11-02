package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseclass.BrowserConfig;

public class Test1 {
	
WebDriver driver;
@BeforeTest
	public void get()
	{
		driver=BrowserConfig.getdriver();
	}
  @Test(priority=2,groups="Regression")
  public void open() {
	  System.out.println("OPened");
  }
  @Test(priority=1,groups="smoke")
  public void testcase2()
  {
	  System.out.println(" Check priority");
  }
  @AfterTest
  public void close()
  {
	  driver.close();
  }
}
