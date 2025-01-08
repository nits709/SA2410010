package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SATNG_03_DataProvider {

	@Test(dataProvider = "sendData")
	public void getData(String browserName, String UserName, String phoneNumber, String emailID) {

		System.out.println("browserName " + browserName + "UserName " + UserName + "phoneNumber " + phoneNumber
				+ "emailID " + emailID);

	}

	@DataProvider
	public Object[][] sendData() {

		Object[][] data = new Object[3][4];

		// row 1

		data[0][0] = "Chrome";
		data[0][1] = "Admin";
		data[0][2] = "2345677";
		data[0][3] = "nitin@yopmail.com";

		data[1][0] = "Mozilla";
		data[1][1] = "SuperAdmin";
		data[1][2] = "XXXXXXX";
		data[1][3] = "sachin@yopmail.com";

		data[2][0] = "Edge";
		data[2][1] = "LocalAdmin";
		data[2][2] = "---YYY";
		data[2][3] = "Deepak@yopmail.com";

		return data;

	}
}
