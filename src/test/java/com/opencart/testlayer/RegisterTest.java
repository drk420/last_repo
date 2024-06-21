package com.opencart.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pagelayer.HomePage;
import com.opencart.pagelayer.RegisterPage;
import com.opencart.testbase.Testbase;

public class RegisterTest extends Testbase {

	@Test
	 public void verifyregisterpasswordandconfirmpassword() {
			
			String Expected_Result ="Password confirmation does not match password!";
			
			HomePage homepage_obj = new HomePage (driver);
			homepage_obj.clickonmyaccountlink();
			homepage_obj.clickonlinkregisterlink();
			
			RegisterPage register_obj = new RegisterPage(driver);
			
			register_obj.enterfirstname("David");
			register_obj.enterlastname("ben");
			register_obj.enteremail("kinikar@22gmail.com");
			register_obj.entertelephone("+918788172074");
			register_obj.enterpassword("12345");
			register_obj.enterconfirmpassword("123456");
			register_obj.clickonradiobutton();
			register_obj.clickonprivacypolicy();
			register_obj.clickoncontinuebutton();
			
			String Actual_Result = register_obj.getpassworderrormsg();
			System.out.println(Actual_Result);
			Assert.assertEquals(Actual_Result,Expected_Result);
			}
	 
	
	        @Test
	        public void verifyregisterpasswordandconfirmpasswordwithsubscribeoption() {
			
			String Expected_Result ="Password confirmation does not match password!";
			
			HomePage homepage_obj = new HomePage (driver);
			homepage_obj.clickonmyaccountlink();
			homepage_obj.clickonlinkregisterlink();
			
			RegisterPage register_obj = new RegisterPage(driver);
			
			register_obj.enterfirstname("David");
			register_obj.enterlastname("ben");
			register_obj.enteremail("kinikar@23gmail.com");
			register_obj.entertelephone("+918788172074");
			register_obj.enterpassword("12345");
			register_obj.enterconfirmpassword("123456");
			register_obj.clicnewsletteryesbutton();
			register_obj.clickonprivacypolicy();
			register_obj.clickoncontinuebutton();
			
			String Actual_Result = register_obj.getpassworderrormsg();
			System.out.println(Actual_Result);
			Assert.assertEquals(Actual_Result,Expected_Result);
			}
		
		@Test
		public void verifyregisteraccountwithvalidcredentials() {
			
		//	String Expected_Result = "Your Account Has Been Created!";
			HomePage homepage_obj = new HomePage(driver);
			
			homepage_obj.clickonmyaccountlink();
			homepage_obj.clickonlinkregisterlink();
			
			RegisterPage register_obj = new RegisterPage(driver);
			register_obj.enterfirstname("Dnyaneshwar");
			register_obj.enterlastname("Kinikar");
			register_obj.enteremail("kinikardnyaneshwar34@gmail.com");
			register_obj.entertelephone("+918788172074");
			register_obj.enterpassword("12345");
			register_obj.enterconfirmpassword("12345");
			register_obj.clickonradiobutton();
			register_obj.clickonprivacypolicy();
			register_obj.clickoncontinuebutton();
			
		//	String Actual_Result = register_obj.getsuccessmsg();
		//	System.out.println(Actual_Result);
		//	Assert.assertEquals(Actual_Result,Expected_Result);
		}
		
		@Test
       public void verifyregisteraccountwithexistingcredentialls() {
			
			String Expected_Result = "Warning: E-Mail Address is already registered!";
			
			HomePage homepage_obj = new HomePage(driver);
			
			homepage_obj.clickonmyaccountlink();
			homepage_obj.clickonlinkregisterlink();
			
			RegisterPage register_obj = new RegisterPage(driver);
			register_obj.enterfirstname("Dnyaneshwar");
			register_obj.enterlastname("Kinikar");
			register_obj.enteremail("kinikardnyaneshwar34@gmail.com");
			register_obj.entertelephone("+918788172074");
			register_obj.enterpassword("12345");
			register_obj.enterconfirmpassword("12345");
			register_obj.clickonradiobutton();
			register_obj.clickonprivacypolicy();
			register_obj.clickoncontinuebutton();
			
			String Actual_Result = register_obj.geterrormsg();
		    System.out.println(Actual_Result);
			Assert.assertEquals(Actual_Result,Expected_Result);
		
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

