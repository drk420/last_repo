package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeskTopsPage {

	
	public DeskTopsPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//a[contains(text(),'- Mac (1)')]")
	private WebElement mac_link;
	
	
	
	public void clickonmaclink() {
		
		mac_link.click();
		
		
	}
	
	
	
	
	
	
}
