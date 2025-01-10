package com.testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class SATNG_04_testng_Assertions {

	
	@Test
	public void HardAssertMethods() {
		
//		String str1 = "hello";
//		String str2 = "hello";
//		
//		System.out.println(str1.equals(str2));
		// hard assert.
		// launching browser
		//navigate to URL
		//validating the title page //
		//do login // hard assert.
		//navigate to plp
		Assert.assertTrue(12>11); // not passing the message
		Assert.assertTrue(11>14,"some thing is wrong with the conditions"); // passing message.
		Assert.assertTrue(5<10,"5 is not smaller than 10 , please verify");
	}
	
	@Test
	public void softAssertMethod() {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("ABC","ABC");
		
		soft.fail("testexecution failed");  // this method makes your testcase failed but wont stop the execution
		
		
		
		soft.assertEquals("ABC","XYZ"); // fail
		soft.assertTrue(5>11,"Error Message");// fail
		
		
		
		soft.assertAll(); // act as basket, will report all steps got failed during execution into the logs or reports
		
	}
	
	
}
