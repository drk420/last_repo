package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.AffilatePage;
import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.LoginPage;
import com.opencart.pagelayer.MyAccount;
import com.opencart.testbase.Testbase;

public class AffilateFunctionalityTest extends Testbase {

	
	@Test
	public void verifyaffilateaccountfunctionality() throws InterruptedException {
		
		String Expected_Result = "Success: Your account has been successfully updated.";
		HomePage homepage_obj = new HomePage (driver);
		homepage_obj.clickonmyaccountlink();
		homepage_obj.clickonloginlink();
		
		LoginPage loginpage_obj = new LoginPage(driver);
		
		loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
		loginpage_obj.enterpasswordtextbox("1234");
		loginpage_obj.clickonloginbutton();
		
		MyAccount myaccount = new MyAccount(driver);
		myaccount.clickoneditaffilateaccountlink();
		AffilatePage affilatepage_obj = new AffilatePage (driver);
		affilatepage_obj.entertextincompanytextbox("tata");
		affilatepage_obj.entertextinwebsitetextbox("tata22@gmail.com");
		affilatepage_obj.entertextintaxtextbox("TAX1211");
		affilatepage_obj.clickoncheckradiobutton();
		affilatepage_obj.enterincheckpaynametextbox("stain rootlee");

		affilatepage_obj.clickoncontinuebutton();
		Thread.sleep(5000);
		String Actual_Result = myaccount.getaccountsuccess();
		logger.info(Actual_Result);
		Thread.sleep(5000);
		Assert.assertEquals(Actual_Result,Expected_Result);
		
	}}
	
