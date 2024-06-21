package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.LoginPage;
import com.opencart.pagelayer.MyAccount;
import com.opencart.pagelayer.SearchPage;
import com.opencart.pagelayer.ShoppingCart;
import com.opencart.testbase.Testbase;

public class AddToCartTest extends Testbase{

	@Test
	public void verifyaddtocartwithexhistingproduct() throws InterruptedException {
		
	//	String Expected_Result = "Success: You have added iMac to your shopping cart!";
		
		
		
		HomePage homepage_obj = new HomePage (driver);
		homepage_obj.clickonmyaccountlink();
		homepage_obj.clickonloginlink();
		
		
		LoginPage loginpage_obj = new LoginPage (driver);
		
		loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
		
		loginpage_obj.enterpasswordtextbox("1234");
		
		loginpage_obj.clickonloginbutton();
		MyAccount myaccount_obj= new MyAccount(driver);
		myaccount_obj.enterdatainsearchtextbox("iMac");
		myaccount_obj.clickonsearchiconbutton();
		SearchPage searchpage_obj = new SearchPage (driver);
	    
		searchpage_obj.clickonaddtocartbutton();
		Thread.sleep(5000);
	  //  String Actual_Result = searchpage_obj.getsuccessmsg();
		
		//logger.info(Actual_Result);
		//Assert.assertEquals(Actual_Result,Expected_Result);
		ShoppingCart shopping_obj = new ShoppingCart(driver);
		shopping_obj.clickonshoppingcartlink();
		Boolean result = shopping_obj.verifyimacisdisplayed();
		Assert.assertTrue(result);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
