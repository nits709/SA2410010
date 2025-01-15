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
import org.testng.annotations.Test;

public class SATNG_02_POI_WriteDataInExcelFile {

	
	static String fPath = "/Volumes/Renuka/TrainingExcelFiles/MyFirstExcelFiles.xlsx" ;
	static File file;
	static FileOutputStream fos;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	
	
	@BeforeTest
	public void setupObjects() throws IOException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("LoginCredentials");
	}
	
	@Test
	public void writeData() {
		row = sheet.createRow(0);  // creating a row at zero index
		cell = row.createCell(0); // creating cell at zero cell
		
		cell.setCellValue("SeleniumSession");
	}
	
	
	@Test
	public void writeData1() {
		//row = sheet.createRow(0);   // creating a row at zero index
		cell = row.createCell(1);
		cell.setCellValue("SeleniumSession");
	}
	
	@AfterTest
	public void closeObjects() throws IOException {
		wb.write(fos);
		System.out.println("Data Added in the file");
		wb.close();
		fos.close();
	}
	
	
	
	
	
	
	
}
