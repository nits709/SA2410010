package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SA_01_POI_ReadDataFromExcelFile {
	
	static String fPath = "/Volumes/Renuka/TrainingExcelFiles/Book2.xlsx" ;
	// File file;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	

	
	public static void main(String[] args) throws IOException {
			
		File file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("LoginData");
		
			row = sheet.getRow(0);
			cell = row.getCell(0);
			
			
			int totalRows = sheet.getPhysicalNumberOfRows();
				// return no. of rows
			int totalCells = sheet.getRow(0).getPhysicalNumberOfCells(); // return no. of cells
			
//			System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//			System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//			System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
			
		
			
			// no of rows in file =  8
			//no of cell in file = 3 
			for(int i = 0; i < totalRows; i++) {    //row = 1 
				
				row = sheet.getRow(i);  // 0 only
				for( int j = 0 ; j < totalCells ; j++) { // cell = 0
					 cell = row.getCell(j);  // 0,0 == username | 0,1 = password , 0.2 = Result
					                         // 1,0 | 1,1 | 1,2|
					 System.out.print(cell.getStringCellValue() + " | "); // username,password,Result
				}
				System.out.println();   // bring cursour to next line.
				
			}
			
			
			wb.close();
			fis.close();
		
		
		

	}

}
