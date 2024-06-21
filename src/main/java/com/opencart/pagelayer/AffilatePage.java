package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.Testbase;
import com.opencart.utility.ScrollUpandScrollDown;

public class AffilatePage extends Testbase{

	
	public AffilatePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(xpath="//input[@id='input-company']")
	private WebElement company_textbox;
	
	@FindBy(xpath="//input[@id='input-website']")
	private WebElement websit_textbox;
	
	@FindBy(xpath="//input[@id='input-tax']")
	private WebElement taxid_textbox;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[1]/label[1]")
	private WebElement paymentmethodcheque_radiobutton;
	
	@FindBy(xpath="//input[@id='input-cheque']")
	private WebElement checkpayeename;
	
	@FindBy(xpath="//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement aboutus_checkbox;
	
	@FindBy(xpath="//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement continue_button;
	
	@FindBy(xpath="//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[2]/label[1]/input[1]")
	private WebElement paypal_radiobutton;
	
	@FindBy(xpath="//input[@id='input-paypal']")
	private WebElement paypalemai_textbox;
	@FindBy(xpath="//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement paypalcontinue_button;
	
	public void entertextincompanytextbox(String companyname) {
		company_textbox.sendKeys(companyname);
		
		
	}
	public void entertextinwebsitetextbox(String website) {
		websit_textbox.sendKeys(website);
		
		
	}
	
	
	public void entertextintaxtextbox(String taxid) {
		taxid_textbox.sendKeys(taxid);
		
		
	}
	
	public void clickoncheckradiobutton() {
		paymentmethodcheque_radiobutton.click();
		
		
	}
	
	public void enterincheckpaynametextbox(String name ) {
		checkpayeename.sendKeys(name);
		
		
	}

	public void clickonaboutuscheckbox() {
		aboutus_checkbox.click();
		
		
		
	}
	
	public void clickoncontinuebutton() {
		continue_button.click();
		
		
		
	}
	

	public void enterpaypalemail(String email) {

		

		paypalemai_textbox.sendKeys(email);
					
					
				}
	public void clickonpaypalcontinuebutton() {
	
		paypalcontinue_button .click();
				
				
	}
	
	public void clickonpaypalradiobutton() {
	paypal_radiobutton.click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
