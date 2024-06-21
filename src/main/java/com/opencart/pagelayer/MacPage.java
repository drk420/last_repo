package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.utility.Util;

public class MacPage {

	
	public MacPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//button[@data-original-title=\"Add to Wish List\"]")
	private WebElement addtowhishlist_link;
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement success_msg;

	
	public void clickonaddtowhishlistlink() {
		
		
		
		addtowhishlist_link.click();
		
		
	}
	public String verifysuccessmsg() {
		
	String successmsg	= success_msg.getText();
	return successmsg;
	
	
	
	}
	
	
	
	
	
	
	
	
}
