package com.test.utility;

import java.util.ArrayList;

import com.pega.uiframework.utils.Xls_Reader;

public class TestUtil {
	
	public static Xls_Reader reader;
	
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:\\Users\\Dell\\OneDrive - MMI HOLDINGS LTD\\Documents\\Workspace\\simpleProject\\src\\com\\testdata\\halfebaytestdata.xlsx");
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		for(int rowNum = 2; rowNum <= reader.getRowCount("RegTestData");rowNum++) {
			String fname = reader.getCellData("RegTestData", "FirstName", rowNum);
			String lname = reader.getCellData("RegTestData", "LastName", rowNum);
			String email = reader.getCellData("RegTestData", "Email", rowNum);
			String password = reader.getCellData("RegTestData", "Password", rowNum);
			
			Object ob[] = {fname, lname, email, password};
			myData.add(ob);
		}
		return myData;
	}
	

}
