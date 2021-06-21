package com.learnautomation.utility;

import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory 
{
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "./Drivers/IEdriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("We do not support for this browser");
		}
		
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void quiteBrowser(WebDriver driver)
	{
		driver.close();
	}

}
