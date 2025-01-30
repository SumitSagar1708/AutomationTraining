package com.framework.utilites;

import java.util.List;
import java.util.Map;


public class ReadExcel {

public static void main(String[] args) {
	
        // Read Excel into List
	List<Map<String, String>> Data = Excelutil.readExcelData("ProductDetails.xlsx", "Sheet1");
	
	for (String cell : Data.get(2)) {
        System.out.print(cell + " ");

    
        
	}
    }
}