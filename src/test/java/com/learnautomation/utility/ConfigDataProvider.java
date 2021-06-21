package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;
	
	public ConfigDataProvider()
	{
		try 
		{
			File src = new File("./Config/config.properties");
			FileInputStream fis = new FileInputStream(src);
			pro= new Properties();
			pro.load(fis);
			
		}
		catch (Exception e) 
		{
			System.out.println("No able to load the file" + e.getMessage());
		}
		
	}
	
	public String getDatafromConfig(String keytoSearch)
	{
		return pro.getProperty(keytoSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String getURL()
	{
		return pro.getProperty("QA_url");

	}
	
	

}
