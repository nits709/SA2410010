package com.testNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SATNG_05_DependsFuctionality {

	
	
	boolean flag =false;
	
	@Test (priority=1)
	public void search() {
		if(flag)
			throw new SkipException("Skipping the test");
		System.out.println("searching the phone");
	}
	
	@Test (priority=2,dependsOnMethods= {"search"})
	public void selectPhone() {
		System.out.println("selects the phone");
	}
	
	@Test  (priority=3,dependsOnMethods= {"search","selectPhone"})
	public void checkout() {
		System.out.println("pay the mobile bills and get the product");
	}
}
