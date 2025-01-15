package com.testNG;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SATNG_03_POI_WriteDataInMultipleLines {
	
	 String fPath = "MyFirstExcelFiles.xlsx" ;
	 File file;
	 FileOutputStream fos;
	 XSSFWorkbook wb;
	 XSSFSheet sheet;
	 XSSFRow row;
	 XSSFCell cell;
	 int index = 0;

	@BeforeTest
	public void setupObjects() throws IOException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("SampleData");
	}
	
	@Test(dataProvider = "supplyTestData")
	public void getData(String username, String password, String mobileNumber) {
		 row = sheet.createRow(index);
		 cell = row.createCell(0);
		 	
		cell.setCellValue(username);
		
		
		cell = row.createCell(1);
		cell.setCellValue(password);
		
		cell = row.createCell(2);
		cell.setCellValue(mobileNumber);
		
		index++;
	}
	
	@DataProvider
	public Object[][] supplyTestData(){
		
		return new Object[][] {
			new Object[] { "Nitin","nitin123", "1234556"},
			new Object[] { "Prateek","prateek123", "99999"},
			new Object[] { "Deepak","sachin534", "22222"},
			new Object[] { "Neha","Neha321", "55555"},
			new Object[] { "john","Jogn123", "88888"},
			new Object[] { "Micheal","n!!!!123", "111111"}
			
		};
		
	}
	
	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}
	
	
	
	
	
	
}
