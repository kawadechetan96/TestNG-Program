package com.excelconfig;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelconfig {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	public  static Object[][] excelconfig(String sheetname) throws Exception
	{
		File source=new File("./Data Provider/Dataprovider.xlsx");
		FileInputStream fis=new FileInputStream(source);
		
		wb=new XSSFWorkbook(fis);
		
		sheet=wb.getSheet(sheetname);
		
	int row=sheet.getLastRowNum();
	int column=sheet.getRow(1).getLastCellNum();
	
	Object[][] data=new Object[row][column];
	
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<column; j++)
		{
			data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
		}
	}
		return data;
	}
	

}
