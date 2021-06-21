package com.learnautomation.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class BaseClass 
{
	protected WebDriver uiDriver;
	protected ExcelDataProvider dataProvider;
	protected ConfigDataProvider configDataProvider;
	
	
	
	@BeforeSuite
	public  void setUpSuite()
	{
		dataProvider = new ExcelDataProvider();
		configDataProvider = new ConfigDataProvider();
	}
	
	
	@BeforeClass
	public void setup()
	{
		try
		{
			uiDriver = BrowserFactory.startApplication(uiDriver, configDataProvider.getBrowser(),configDataProvider.getURL());

		}
		catch (Exception e) 
		{
			System.out.println("Error when launch app");
		}

	}
	
	
	  @AfterClass 
	  public void quite() { 
		  BrowserFactory.quiteBrowser(uiDriver);
	  
	  }
	  
	  @AfterMethod
	  public void tearDownMethod(ITestResult result)
	  {
		  if(result.getStatus()==ITestResult.FAILURE)
		  {
			  Helper.captureScreenshot(uiDriver);
		  }
	  }
	 
	

}
