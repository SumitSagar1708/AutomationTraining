package com.framework.utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	public static List<Map<String,String>> readExcelData (String fileName, String sheetName) {
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName); 
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet(sheetName); 
			int totalRows = sheet.getPhysicalNumberOfRows(); 
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			
			for(int r=1;r<totalRows ; r++) {				
				HashMap<String,String> rowData = new HashMap<String,String>(); 				
				for(int c=0; c<totalColumns;c++) {
					String columnName = sheet.getRow(0).getCell(c).getStringCellValue();
					String columnValue = sheet.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnValue);
				}
				data.add(rowData);
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return data;		
	}

}
