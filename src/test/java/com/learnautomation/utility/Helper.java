package com.learnautomation.utility;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;

import freemarker.template.SimpleDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper 
{
	
	public static void captureScreenshot(WebDriver driver)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(src, new File("./Screenshots/freecrm"+getCurrentDateTime()+".png"));
		}
		catch(Exception ex)
		{
			System.out.println("Unable to capture screenshot"+ex.getMessage());
		}
	}
	
	public void handleFrames()
	{
		
	}
	
	
	public static String getCurrentDateTime()
	{

		DateFormat customFormat = new SimpleDateFormat("HH_dd_yyyy_HH_mm_ss");
		
		Date currentDate = new Date();
		return customFormat.format(currentDate);
		
	}

}
