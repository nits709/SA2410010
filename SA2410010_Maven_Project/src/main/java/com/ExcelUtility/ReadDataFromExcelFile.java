package com.ExcelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadDataFromExcelFile {

	
	 String fPath = "/Volumes/Renuka/SA2410010/SA2410010_Maven_Project/ExcelFiles/LoginData.xlsx" ;
	 File file;
	 FileInputStream fis;
	 XSSFWorkbook wb;
	static  XSSFSheet sheet;
	static  XSSFRow row;
	static  XSSFCell cell;
	static int totalRows;
	 
	public static void main(String[] args) throws IOException {
		ReadDataFromExcelFile r = new ReadDataFromExcelFile();
			Object[][] lData = (String[][]) r.getLoginData();
		
			for (int i = 0; i < totalRows; i++) {
				
				for (int j = 0; j < 2; j++) {
				
					System.out.println(lData[i][j]);
					
					
				}
			}		
	}

	
	@DataProvider
	public Object[][] getLoginData() throws IOException{
		
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		//sheet = wb.getSheet("LoginData");
		sheet = wb.getSheetAt(0);
		
				
		totalRows = sheet.getPhysicalNumberOfRows();
		Object[][] data = new String[totalRows][2];
		int totalCells = sheet.getRow(0).getPhysicalNumberOfCells(); 
		
		for (int i = 0; i < totalRows; i++) {
			for (int j = 0; j < totalCells; j++) {
		System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
		
				data[i][j] =sheet.getRow(i).getCell(j).getStringCellValue();
		}
			}
		
		return data ;
	}
	
	
}
