package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.DeskTopsPage;
import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.LoginPage;
import com.opencart.pagelayer.MacBook;
import com.opencart.pagelayer.MacPage;
import com.opencart.pagelayer.MyAccount;
import com.opencart.pagelayer.SearchPage;
import com.opencart.testbase.Testbase;

public class WhishListTest extends Testbase{

	
	@Test
	public void verifywhishlistfunctionalitywithexhistingproduct() throws InterruptedException {
		                      
   
	//String Expected_Result = "Success: You have added iMac to your wish list!";
    	
	HomePage homepage_obj = new HomePage (driver);
	
	homepage_obj.clickonmyaccountlink();
	homepage_obj.clickonloginlink();
	
	LoginPage loginpage_obj = new LoginPage(driver);
	
	loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
	loginpage_obj.enterpasswordtextbox("1234");
	loginpage_obj.clickonloginbutton();
	MyAccount myaccount_obj = new MyAccount(driver);
	myaccount_obj.enterdatainsearchtextbox("IMac");
	myaccount_obj.clickonsearchiconbutton();
	
	SearchPage search_obj = new SearchPage (driver);

	search_obj.clickonwishlistbutton();
	
   // Thread.sleep(5000);
	//String Actual_Result = search_obj.getsuccessmsg();
	//logger.info(Actual_Result);
   // Assert.assertEquals(Actual_Result,Expected_Result);
	}
	
	@Test
	public void verifywhishlistfunctionalitywithdesktopoption() throws InterruptedException {
		
	//	String Expected_Result ="Success: You have added iMac to your wish list!";
		HomePage homepage_obj = new HomePage (driver);
		
		homepage_obj.clickonmyaccountlink();
		homepage_obj.clickonloginlink();
		
		LoginPage loginpage_obj = new LoginPage(driver);
		
		loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
		loginpage_obj.enterpasswordtextbox("1234");
		loginpage_obj.clickonloginbutton();
		MyAccount myaccount_obj = new MyAccount(driver);
		logger.info("navigated to account page");
		myaccount_obj.mouseoverondesktop();
		DeskTopsPage desktop_obj = new DeskTopsPage(driver);
		logger.info("navigated to desktop page");
		desktop_obj.clickonmaclink();
		MacPage macPage_obj = new MacPage(driver);
		macPage_obj.clickonaddtowhishlistlink();
		Thread.sleep(5000);
	  //  String ActualResult	= macPage_obj.verifysuccessmsg();
	
	  //  Assert.assertEquals(ActualResult,Expected_Result);
	
	}
	
	@Test
	public void verifywishlistwithsearchcriteria() {
		
	//	String Expected_Result = "Success: You have added iMac to your wish list!";
		
        HomePage homepage_obj = new HomePage (driver);
		
		homepage_obj.clickonmyaccountlink();
		homepage_obj.clickonloginlink();
		
		LoginPage loginpage_obj = new LoginPage(driver);
		
		loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
		loginpage_obj.enterpasswordtextbox("1234");
		loginpage_obj.clickonloginbutton();
		
		MyAccount myaccount_obj = new MyAccount(driver);
		myaccount_obj.enterdatainsearchtextbox("IMac");
		myaccount_obj.clickonsearchiconbutton();
		
		SearchPage searchpage_obj = new SearchPage(driver);
		searchpage_obj.clickonsearchbutton();
		searchpage_obj.clickonwishlistbutton();
	//	String Actual_Result = searchpage_obj.getsuccessmsg();
	//	Assert.assertEquals(Actual_Result,Expected_Result);
		
	}
	
}
