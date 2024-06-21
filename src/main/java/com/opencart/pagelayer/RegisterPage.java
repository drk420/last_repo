package com.opencart.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.testbase.Testbase;

public class RegisterPage extends Testbase {

	
	public RegisterPage (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//input[@id=\"input-firstname\"]")
	private WebElement firstname_textbox;
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	private WebElement lastname_textbox;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	private WebElement email_textbox;
	
	@FindBy(xpath="//input[@id=\"input-telephone\"]")
	private WebElement telephone_textbox;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	private WebElement password_textbox;
	
	@FindBy(xpath="//input[@id=\"input-confirm\"]")
	private WebElement confirmpassword_textbox;
	
	@FindBy(xpath="(//input[@type=\"radio\"])[3]")
	private WebElement no_radiobutton;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	private WebElement privacypolicy_checkbox;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement continue_button;
	
	@FindBy(xpath="//div[text()=\"Password confirmation does not match password!\"]")
	private WebElement password_errormsg;
	
	@FindBy(xpath="//h1[contains(text(),\"Your Account Has Been Created!\")]")
	private WebElement success_msg;
	
	@FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]")
	private WebElement Error_msg;
	
	@FindBy(xpath="(//input[@type=\"radio\"])[2]")
	private WebElement newsletteryes_radio_button;
	
	public void enterfirstname(String firstname) {
		
		firstname_textbox.sendKeys(firstname);
		
	}
	
    public void enterlastname(String lastname) {
		
    	lastname_textbox.sendKeys(lastname);
		
	}
	
    public void enteremail(String email) {
	
    	email_textbox.sendKeys(email);
	
}

       public void entertelephone(String telephone) {
	
	telephone_textbox.sendKeys(telephone);
	
}

      public void enterpassword(String password) {
	
	password_textbox.sendKeys(password);
	
}

       public void enterconfirmpassword(String confirmpassword) {
	
	confirmpassword_textbox.sendKeys(confirmpassword);
	
}

       public void clickonradiobutton() {
	
	no_radiobutton.click();
	
}

       public void clickonprivacypolicy() {
	
	privacypolicy_checkbox.click();
	
}

      public void clickoncontinuebutton() {
	
	continue_button.click();
	
}
      public String getpassworderrormsg() {
    	  
      String passworderrormsg	 = password_errormsg.getText();
    
      return passworderrormsg;
    
      }
      
      public String getsuccessmsg() {
    	  
    	String Successmsg  = success_msg.getText();
    	return Successmsg;
    	
    	}
    
      public String geterrormsg() {
    	  
      	String Errormsg  = Error_msg.getText();
      	return Errormsg;
      	
      	}
      
      public void clicnewsletteryesbutton() {
    		
    	  newsletteryes_radio_button.click();
    			
    		
    		
    	}
      
}
