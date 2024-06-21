package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.MacBook;
import com.opencart.pagelayer.ShoppingCart;
import com.opencart.testbase.Testbase;

  public class CheckOutTest extends Testbase{

	  @Test
	  public void verifymacbookcheckouttestcase() {
		
		String Expected_Result = "Checkout";
		HomePage homepage_obj = new HomePage(driver);
		
		homepage_obj.clickonmacbook();
		MacBook macbook_obj = new MacBook(driver);
		macbook_obj.clickonaddtocartbutton();
		macbook_obj.clickonitems();
		macbook_obj.clickonviewcart();
		
		ShoppingCart shoppingcart_obj = new ShoppingCart(driver);
		shoppingcart_obj.clickonviewcart();
	
		String Actual_Result =driver.getTitle();
		System.out.println("Actual result is:-"+ Actual_Result);
		Assert.assertEquals(Actual_Result, Expected_Result);
		
}}
