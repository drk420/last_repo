package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.Testbase;

public class LogoutPage extends Testbase {

	
	

	public LogoutPage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	
	
	@FindBy(xpath="//a[text()=\"Continue\"]")
	private WebElement continue_button;
	
	@FindBy(xpath="//a[text()=\"Login\"]")
	private WebElement login_link;
	
	@FindBy(xpath="//a[@title=\"My Account\"]")
	private WebElement myaccount_dropdown;
	
	
	
	
	
	
	
	
	public void myaccountdropdown() {
		
		
		myaccount_dropdown.click();
	
		
	}
	
     public void clickoncontinuebutton() {
		
		continue_button.click();
		
	}
	
     public void verifyloginoption() throws InterruptedException {
	 
    	 Thread.sleep(5000);
       boolean loginoption	 = login_link.isDisplayed();
	   System.out.println(loginoption);
	  
}
	
	
	
}
