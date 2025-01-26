package com.framework.utilites;

import java.util.List;
import java.util.Map;

public class ReadExcel {

public static void main(String[] args) {
		
		//Read Excel into 2d array
		String [][] data = Excelutil.readData("ProductDetails.xlsx", "Sheet1");
		
		//Read Excel into List
				List<Map<String,String>> excelData = Excelutil.readData("CollectionsAssignment.xlsx", "ProductDetails");
				
				System.out.println(excelData.get(2));
		
		System.out.println(excelData.get(2));
		

	}

}
