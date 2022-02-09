package com.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	public static XSSFWorkbook wb;
	public static FileInputStream fis;
	public static XSSFSheet sheet;
	public static  Object[][] config(String sheetname)
	{
	File source=new File("./Data Provider/Dataprovider.xlsx");
	
	try {
		fis = new FileInputStream(source);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	try {
		wb = new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 sheet=wb.getSheet(sheetname);
	
	int row=sheet.getLastRowNum();
	System.out.println("Total row is:-"+row);
	
	int column=sheet.getRow(0).getLastCellNum();
	System.out.println("Total column is:-"+column);
	
	
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
