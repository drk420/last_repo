package com.opencart.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.Testbase;
import com.opencart.utility.ScrollUpandScrollDown;

public class SearchPage extends Testbase {

	
public	SearchPage (WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
	
	@FindBy(xpath="//button[@data-original-title=\"Add to Wish List\"]")
	private WebElement addtowhishlist_button;
	
	@FindBy(xpath="//body/div[@id='product-search']/div[1]")
	private WebElement success_msg;
	
	@FindBy(xpath="//input[@id='button-search']")
	private WebElement search_button;
	
	@FindBy(xpath="//body/div[@id='product-search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[1]")
    private WebElement addtocart_button;
	
	
	public void clickonwishlistbutton() {
		
		addtowhishlist_button.click();
		
	}
	
	public String getsuccessmsg() {
	String successmsg	= success_msg.getText();
		return successmsg;
	}
	
	public void clickonsearchbutton() {
		
	search_button.click();
	
	
	
	}
	public void clickonaddtocartbutton() {
		ScrollUpandScrollDown.Javascrptexecutor(addtocart_button);
		addtocart_button.click();
		
	}
	
	
	
	
}
