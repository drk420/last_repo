package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.LoginPage;
import com.opencart.pagelayer.LogoutPage;
import com.opencart.pagelayer.MyAccount;
import com.opencart.testbase.Testbase;

public class LogoutTest extends Testbase{

	@Test
	public void verifylogouttest() {
		
		String Expected_Result="Account Logout";
			
		HomePage homepage_obj = new HomePage (driver);
		homepage_obj.clickonmyaccountlink();
		homepage_obj.clickonloginlink();
		
		LoginPage loginpage_obj = new LoginPage(driver);
		
		loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
		loginpage_obj.enterpasswordtextbox("1234");
		loginpage_obj.clickonloginbutton();
		
		MyAccount myaccount_onj = new MyAccount(driver);
		myaccount_onj.myaccountdropdown();
		myaccount_onj.clickonlogoutlink();
		String Actual_Result = myaccount_onj.getlogoutmsg();
		System.out.println(Actual_Result);
		Assert.assertEquals(Actual_Result,Expected_Result);
		
		
		
		
		
		
	}
	
       @Test
       public void verifylogouttestwithlogoutoptionfromright() throws InterruptedException {
		
	    String Expected_Result="https://naveenautomationlabs.com/opencart/index.php?route=common/home";
			
		HomePage homepage_obj = new HomePage (driver);
		homepage_obj.clickonmyaccountlink();
		homepage_obj.clickonloginlink();
		
		LoginPage loginpage_obj = new LoginPage(driver);
		
		loginpage_obj.enteremailaddresstextbox("kinikardnyaneshwar28@gmail.com");
		loginpage_obj.enterpasswordtextbox("1234");
		loginpage_obj.clickonloginbutton();
		
		MyAccount myaccount_onj = new MyAccount(driver);
	
		myaccount_onj.clickonlogoutbutton();
	
		
		LogoutPage logout_obj = new LogoutPage(driver);
		logout_obj.myaccountdropdown();
		logout_obj.verifyloginoption();
		logout_obj.clickoncontinuebutton();
		
		String Actual_Result = driver.getCurrentUrl();
		System.out.println(Actual_Result);
		Assert.assertEquals(Actual_Result,Expected_Result);
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
