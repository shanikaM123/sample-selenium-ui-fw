package com.learnautomation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.base.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass
{
	
	

	@Test
	public void loginApp()
	{
		try
		{
			LoginPage loginPage = PageFactory .initElements(uiDriver, LoginPage.class);
			loginPage.logintoCRM(dataProvider.getStringData("Login", 0, 0),dataProvider.getStringData("Login", 0, 1));
			Helper.captureScreenshot(uiDriver);
			
		}
		catch(Exception ex)
		{
			System.out.println("Failed to Login to the System");
		}
		
	}
	

}
