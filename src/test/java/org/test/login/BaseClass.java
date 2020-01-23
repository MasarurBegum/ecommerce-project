package org.test.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	
	//Excel Read
	public static String excelRead(int rowNo, int cellNo) throws Throwable {
		String cellValue = null;
		File loc= new File("C:\\Users\\MASARUR BEGUM\\firstproject\\TestData\\Masrur.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w= new XSSFWorkbook(stream);
		Sheet s= w.getSheet("Data");
		Row r=s.getRow(rowNo);
		Cell c=r.getCell(cellNo);
		int type=c.getCellType();
		if(type==1)
		{
			cellValue=c.getStringCellValue();
			
		}
		else if (type==0) {
			if(DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue=c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
				cellValue=sim.format(dateCellValue);
			}
			else {
				double numericCellValue=c.getNumericCellValue();
				long l=(long)numericCellValue;
				cellValue=String.valueOf(l);
			}
		}
		
		return cellValue;	
		
		
	}
	
	//Excel Write
			public static void writeExcel(int rowNo, int cellNo, String cellValue) throws Throwable {
				File loc=new File("C:\\Users\\MASARUR BEGUM\\firstproject\\TestData\\Masrur Output.xlsx");
				FileInputStream stream1=new FileInputStream(loc);
				Workbook w=new XSSFWorkbook(stream1);
				Sheet s=w.getSheet("Details");
				Row r=s.createRow(rowNo);
				Cell c=r.createCell(cellNo);
				c.setCellValue(cellValue);
				FileOutputStream stream= new FileOutputStream(loc);
				w.write(stream);
				
			}
	

}
