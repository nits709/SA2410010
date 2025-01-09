package com.testNG;

import org.testng.annotations.Test;

public class SATNG_06_groupingThetestcases {

	@Test(priority = 1, groups = "smoke")
	public void testA() { // login

		System.out.println(" test A");
	}

	@Test(priority = 2, groups = "regression")
	public void registeration() { // logout

		System.out.println(" registeration");
	}

	@Test(priority = 3, groups = "regression")
	public void login() { // login

		System.out.println(" login");
	}

	@Test(priority = 4, groups = "smoke")
	public void searchProduct() { // logout

		System.out.println("searchProduct");
	}

	@Test(priority = 5, groups = "UAT")
	public void productListingPage() {
		System.out.println("productListingPage");
	}

	@Test(priority = 6, groups = "UAT")
	public void addProductToBasket() { // login

		System.out.println("addProductToBasket");
	}

	@Test(priority = 7, groups = "regression")
	public void checkout() { // logout

		System.out.println("checkout");
	}
}
