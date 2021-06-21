package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.learnautomation.base.BaseClass;

public class ExcelDataProvider
{
	XSSFWorkbook workBook;
	
	public ExcelDataProvider()
	{
		try
		{
			File src = new File("./TestData/TestData.xlsx");
			FileInputStream fis = new FileInputStream(src);
			workBook = new XSSFWorkbook(fis);
		}
		catch (Exception e) 
		{
			System.out.println("Issue when reading the data from XL file.."+ e.getMessage());
		}		
	}
	
	public String getStringData(String sheetName,int row,int column)
	{
			return workBook.getSheet(sheetName).getRow(0).getCell(0).getStringCellValue();
	}
	
	public double getNumericData(String sheetName,int row,int column)
	{
		return workBook.getSheet(sheetName).getRow(0).getCell(0).getNumericCellValue();

	}
	
	public double getNumericData(int sheetIndex,int row,int column)
	{
		return workBook.getSheetAt(sheetIndex).getRow(0).getCell(0).getNumericCellValue();

	}

}
