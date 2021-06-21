package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.learnautomation.base.BaseClass;

public class LoginPage extends BaseClass {



	@FindBy(name = "email") WebElement username;
	
	@FindBy(name = "password") WebElement password;
	
	@FindBy(xpath =  "//div[@class='ui fluid large blue submit button']") WebElement loginbtn;
	
	
	public void logintoCRM(String uname,String pswd)
	{
		try 
		{
			Thread.sleep(1000);
			username.sendKeys(uname);
			password.sendKeys(pswd);
			loginbtn.click();
		}
		catch (Exception e)
		{
			System.out.println("error when login to CRM.");
		}
	}
	
}
