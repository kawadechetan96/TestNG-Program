package com.readexcel;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readexcel {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	@Test(priority=1)
	public void readexcel() throws Exception
	{ 
		File source=new File("./Readexcel/Readexcel.xlsx");
		FileInputStream fis=new FileInputStream(source);
		
		 wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheet("Sheet1");
		
		String city=sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println("City name is:-"+city);
		
	}
	
	@Test(priority=2)
	public void readalldata()
	{
		int row=sheet.getLastRowNum();
		System.out.println("Total row is:-"+row);
		
		int column=sheet.getRow(1).getLastCellNum();
		System.out.println("Total column is:-"+column);
		
		for(int i=0; i<row; i++)
		{ 
			for(int j=0; j<column; j++)
			{
				String alldata=sheet.getRow(i+1).getCell(j).getStringCellValue();
				System.out.println("All excel data is:-"+alldata);
				
			}
		}
		
	}

}
