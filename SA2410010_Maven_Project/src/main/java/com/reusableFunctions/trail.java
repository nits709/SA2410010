package com.reusableFunctions;

import java.util.Date;

public class trail {

	
	
	public static void main(String[] args) {
		
		
		Date d = new Date();
		
	System.out.println(	System.getProperty("user.dir")); 		  // will return the current location of 
	//your project
		System.out.println(d.toString());
		
		System.out.println(d.toString().replaceAll(":", "_"));
	}
}
