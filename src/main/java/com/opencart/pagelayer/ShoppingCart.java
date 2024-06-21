package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.Testbase;

public class ShoppingCart extends Testbase {

	public ShoppingCart(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[text()=\"Checkout\"]")
	 private WebElement checkout_button;
	
	@FindBy(xpath="//body/div[@id='checkout-cart']/div[2]/div[1]/form[1]/div[1]")
	private WebElement imac_table;
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingcart_link;
	
	public void clickonviewcart() {
		
		checkout_button.click();
	}
	
	public void clickonshoppingcartlink() {
		
		shoppingcart_link.click();
		
	}
	public Boolean verifyimacisdisplayed() {
		
	Boolean result	= imac_table.isDisplayed();
    return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
