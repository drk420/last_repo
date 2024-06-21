package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.Testbase;

public class MacBook extends Testbase{

	
	public MacBook(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//button[text()=\"Add to Cart\"]")
	private WebElement addtocart_button;
	
	@FindBy(xpath="(//button[@type=\"button\"])[5]")
	private WebElement item_link;
	
	@FindBy(xpath="//strong[text()=\" View Cart\"]")
	 private WebElement viewcart_link;
	
	
	
	public void clickonaddtocartbutton() {
		
		addtocart_button.click();
		
	}
	
	public void clickonitems() {
		
		item_link.click();
		
	}
	
	
    public void clickonviewcart() {
		
		viewcart_link.click();
	}
	
	
}
